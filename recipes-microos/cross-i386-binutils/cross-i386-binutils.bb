SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-i386-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "07ecea54147e70b09cbc8f07f2bb6eb998d837c23e2b0712ae627b537a890f7fb4dd8c18319e9c1cd5762a6b97a1bbd25c5622fae7fc87b1327aab2f08b1e2fa"

RPROVIDES:${PN} += "cross-i386-binutils cross-i386-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
