SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-spu-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "e4b1771146abff87d10e52f7a14379de0b89b4b5ca95b7fea23b3df78550c8610421ad25cd651b21fc6feea4bb683f26205998add6616de8b1a711a7f65512cb"

RPROVIDES:${PN} += "cross-spu-binutils cross-spu-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
