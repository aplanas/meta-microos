SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-mips-binutils-2.40-4.1.aarch64.rpm"
RPM_HASH = "aa5a2457579f111b8fc94ff440ccb3cc921b57338b352390b96cb4f5a7af8c9e06864f5a371c6b327c6e79c4719fd063f4a23f8195832f5a4f69d301254da715"

RPROVIDES:${PN} += "cross-mips-binutils cross-mips-binutils(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit) update-alternatives"

inherit rpm
