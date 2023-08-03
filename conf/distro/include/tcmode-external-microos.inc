#
# Configuration to use the external MicroOS toolchain
#

EXTERNAL_TOOLCHAIN ?= "/usr/local/cross-sdk"
TARGET_PREFIX = "${TARGET_ARCH}-suse-${TARGET_OS}-"

TOOLCHAIN_PATH_ADD = "${EXTERNAL_TOOLCHAIN}/usr/bin:"
PATH =. "${TOOLCHAIN_PATH_ADD}"

# Blacklist toolchain recipes as a belt-and-suspenders way to use the external toolchain
SKIP_RECIPE[libgcc] = "Using external toolchain"
SKIP_RECIPE[libgcc-initial] = "Using external toolchain"
SKIP_RECIPE[gcc-cross] = "Using external toolchain"
SKIP_RECIPE[gcc-cross-aarch64] = "Using external toolchain"
SKIP_RECIPE[gcc-cross-arm] = "Using external toolchain"
SKIP_RECIPE[gcc-runtime] = "Using external toolchain"
SKIP_RECIPE[gcc-sanitizers] = "Using external toolchain"

PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}compilerlibs = "external-microos-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}g++ = "external-microos-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc = "external-microos-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}gcc-initial = "external-microos-toolchain"
PREFERRED_PROVIDER_virtual/${TARGET_PREFIX}libc-for-gcc = "external-microos-toolchain"
PREFERRED_PROVIDER_virtual/linux-libc-headers = "external-microos-toolchain"

# TODO Should this be part of providers.inc?
PREFERRED_PROVIDER_virtual/crypt = "libcrypt1"

TARGET_LDFLAGS += "-L${STAGING_DIR_TARGET}/${libdir}64/gcc/${TARGET_ARCH}-suse-${TARGET_OS}/${MM_PRI_VER_GCC}"

# Validate the presence of the MicroOS external toolchain
python toolchain_metadata_setup () {
    import subprocess
    if not isinstance(e, bb.event.ConfigParsed):
        return

    d = e.data
    l = d.createCopy()

    external_toolchain = l.getVar("EXTERNAL_TOOLCHAIN", True)
    if not external_toolchain or external_toolchain == "UNDEFINED":
        bb.fatal("Error: EXTERNAL_TOOLCHAIN must be set to the path to your MicroOS toolchain")

    if not os.path.isabs(external_toolchain):
        bb.fatal(f"Error: EXTERNAL_TOOLCHAIN path '{external_toolchain}' must be absolute path")

    if not os.path.exists(external_toolchain):
        bb.fatal(f"Error: EXTERNAL_TOOLCHAIN path '{external_toolchain}' does not exist")
}
addhandler toolchain_metadata_setup


#
# Extract the version of the toolchain
#

def mm_run(d, cmd, *args):
    import bb.process
    import subprocess

    toolchain_path = d.getVar("EXTERNAL_TOOLCHAIN", True)
    if not toolchain_path:
        return "UNKNOWN", "UNKNOWN"

    target_prefix = d.getVar("TARGET_PREFIX", True)
    cmd = os.path.join(toolchain_path, "usr", "bin", f"{target_prefix}{cmd}")
    args = [cmd] + list(args)

    return bb.process.run(args, stderr=subprocess.PIPE)

def mm_get_version(d):
    try:
        stdout, stderr = mm_run(d, "gcc", "-v")
    except bb.process.CmdError as exc:
        bb.error(f"Failed to obtain external MicroOS toolchain version: {exc}")
        return "UNKNOWN"
    else:
        last_line = stderr.splitlines()[-1]
        return last_line

def mm_gcc_version(d):
    version = mm_get_version(d)
    if version != "UNKNOWN":
        # "gcc version xx.yy.zz ..."
        return version.split()[2]
    else:
        return version

python toolchain_version_handler() {
    if not isinstance(e, bb.event.ConfigParsed):
        return
    d = e.data
    ld = d.createCopy()

    d.setVar("MM_VER_GCC", mm_gcc_version(ld))
    d.setVar("MM_PRI_VER_GCC", mm_gcc_version(ld).split(".")[0])
}
addhandler toolchain_version_handler