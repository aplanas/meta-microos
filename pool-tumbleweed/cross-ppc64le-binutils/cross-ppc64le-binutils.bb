SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-ppc64le-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "b7d88147a0023921c6d13636a62490c732551f6385b0317ff585957498ae38039a42aedcb726d79333021cf2aefb849221412548697b2fe497d056c28a039f03"

RPROVIDES:${PN} += "cross-ppc64le-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
