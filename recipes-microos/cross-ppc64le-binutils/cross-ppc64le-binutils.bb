SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ppc64le-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "32f4a866d94da42b7f9ade1b708582bebe42ab4220198f69d917dee0c9a22e32a2e77fd39bb202552bec480851b0de6e8df653a675ba58b6a3f045ea17985d32"

RPROVIDES:${PN} += "cross-ppc64le-binutils cross-ppc64le-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
