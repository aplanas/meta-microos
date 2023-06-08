SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-hppa64-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "a210cff10d5fbe4215f49454ebfb4cdcbea2e2693ffa6663d889d37d26ce48144d21e0587de3a2e12cf8284a74ddc17b2ef2fa7da4fd93d54f610507fbd9f540"

RPROVIDES:${PN} += "cross-hppa64-binutils cross-hppa64-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
