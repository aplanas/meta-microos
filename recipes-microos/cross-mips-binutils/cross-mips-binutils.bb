SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-mips-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "18b9b66b5b7ed30a890ae4b3197ca388f1fd303e7c05c4574d24f784e46edd3040fed636fa3c38ed4b7f85e3851a7ee1e0a2f7b09b5bd2a467734f0b4fc29e2b"

RPROVIDES:${PN} += "cross-mips-binutils cross-mips-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
