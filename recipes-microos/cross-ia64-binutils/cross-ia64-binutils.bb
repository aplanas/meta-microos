SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ia64-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "b8aff5938cc2bee6606e63acf84be356c8d94f900fec15fe655a6161e1765380d3f2e81ae0bcb44ee9bca93ded7a080de9db9aa197b49fb325484ba8c6245a18"

RPROVIDES:${PN} += "cross-ia64-binutils cross-ia64-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
