SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-xtensa-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "118efde3b18a838cba546c99025838ceeb0417bd6437843113b03128dd2d3ca03bbb4d8a09f0360ad6d48b87b63f6245e67c5ade122647daac6c4d89f2851390"

RPROVIDES:${PN} += "cross-xtensa-binutils cross-xtensa-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
