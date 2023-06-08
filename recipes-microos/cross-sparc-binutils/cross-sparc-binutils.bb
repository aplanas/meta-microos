SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-sparc-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "e3c8610172ceb0ed3f88bc128120dc66a63aa518ad45f784dc509a10d35bcf3ce5dbebff87c684ee3b992094179c1fa21b684d1060929ef0af6ccfa120ec5b55"

RPROVIDES:${PN} += "cross-sparc-binutils cross-sparc-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
