SUMMARY = "External MicroOS Toolchain"
DESCRIPTION = "Recipe to deploy the external toolchain in the Yocto project"
LICENSE = "GPL-3.0-or-later"

PV = "${MM_VER_GCC}"

PROVIDES += "\
    gcc-runtime \
    virtual/${TARGET_PREFIX}compilerlibs \
    virtual/${TARGET_PREFIX}g++ \
    virtual/${TARGET_PREFIX}gcc \
    virtual/${TARGET_PREFIX}gcc-initial \
    virtual/${TARGET_PREFIX}libc-for-gcc \
"

# TODO: Deduce the versions of libraries (libgcc-s1, libstdc++6, ...)
DEPENDS += "\
    gcc${MM_PRI_VER_GCC} \
    glibc-devel \
    libasan8 \
    libatomic1 \
    libctf-nobfd0 \
    libctf0 \
    libgcc-s1 \
    libgomp1 \
    libhwasan0 \
    libitm1 \
    liblsan0 \
    libstdc++6 \
    libtsan2 \
    libxcrypt-devel \
    linux-glibc-devel \
"

INHIBIT_DEFAULT_DEPS = "1"

python () {
    if not d.getVar("MM_VER_GCC", False):
        raise bb.parse.SkipPackage("External MicroOS toolchain not configured (MM_VER_GCC not set).")
    if not d.getVar("MM_PRI_VER_GCC", False):
        raise bb.parse.SkipPackage("External MicroOS toolchain not configured (MM_PRI_VER_GCC not set).")
    if d.getVar('TCLIBC', True) != "glibc":
        raise bb.parse.SkipPackage("incompatible with %s" % d.getVar('TCLIBC', True))
}
