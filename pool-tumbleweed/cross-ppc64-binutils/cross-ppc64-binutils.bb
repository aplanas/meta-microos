SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ppc64-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "1784bd0b160988f7cf341fffe6ac17d3b132008d659093b097a03a6ab4227b9e0c702510034622e2b413294424ec5d8cd36feefa55969d3f0fcdbcb7d4ab5095"

RPROVIDES:${PN} += "cross-ppc64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
