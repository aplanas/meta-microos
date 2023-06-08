SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-m68k-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "a1429d779ede4e086d5d8aa30f9e1dabe7a42b84b12c311ff0547e8691ede34db9b8177c75831dfd9b7ac2ba602bcead4a4b6e3ede586e9a9a223e943433f438"

RPROVIDES:${PN} += "cross-m68k-binutils cross-m68k-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
