SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-x86_64-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "2686551fc79ea424ab5b1cd1e234eeaa345e76b7118f2913344b3dc3ddfdc5c6f16f4c71661e0c8f32c028757f559add159030323ce4d331ab1bf6b408afdff8"

RPROVIDES:${PN} += "cross-x86_64-binutils cross-x86_64-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
