SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-s390-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "3405615d475f24e05035eeed12e448c947b087a4291bcaadbe4d93f3f3094dbd83c92dc82be94ce4c521927832c106472b15465acb2085b68a1f2f8d4431ad83"

RPROVIDES:${PN} += "cross-s390-binutils cross-s390-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
