SUMMARY = "External MicroOS Toolchain"
DESCRIPTION = "Recipe to deploy the external toolchain in the Yocto project"
LICENSE = "GPL-3.0-or-later"

PV = "${MM_VER_GCC}"

# TODO: check gcc-runtime.inc and transform this into a metapage like "compilerlibs"
PROVIDES += "\
	 gcc-runtime \
	 virtual/${TARGET_PREFIX}compilerlibs \
	 virtual/${TARGET_PREFIX}g++ \
	 virtual/${TARGET_PREFIX}gcc \
	 virtual/${TARGET_PREFIX}gcc-initial \
	 virtual/${TARGET_PREFIX}libc-for-gcc \
"

DEPENDS += "gcc${MM_PRI_VER_GCC} glibc-devel libgcc-s1"

INHIBIT_DEFAULT_DEPS = "1"

python () {
    if not d.getVar("MM_VER_GCC", False):
        raise bb.parse.SkipPackage("External MicroOS toolchain not configured (MM_VER_GCC not set).")
    if not d.getVar("MM_PRI_VER_GCC", False):
        raise bb.parse.SkipPackage("External MicroOS toolchain not configured (MM_PRI_VER_GCC not set).")
    if d.getVar('TCLIBC', True) != "glibc":
        raise bb.parse.SkipPackage("incompatible with %s" % d.getVar('TCLIBC', True))
}
