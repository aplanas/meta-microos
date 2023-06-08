SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ppc-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "667f8e69540938fa33f1aeb2fdc9743f17dd2a7f082ccc83f85c854613cfa3c7f4300cb66438a466d16161d72e4b1f904e403190e7bd18fb21014e3e11e55cc2"

RPROVIDES:${PN} += "cross-ppc-binutils cross-ppc-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
