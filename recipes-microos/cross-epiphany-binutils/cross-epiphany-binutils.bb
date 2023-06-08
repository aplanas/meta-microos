SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-epiphany-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "4908fe3b30278adef910bfef2ffcea625a15c13340dec9b6681441a25f36b9e15767460e9df936865b9fd0e6ad8de25de28831815997ade72e13cdc395fc0f2c"

RPROVIDES:${PN} += "cross-epiphany-binutils cross-epiphany-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
