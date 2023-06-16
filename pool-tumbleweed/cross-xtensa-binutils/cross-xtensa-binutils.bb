SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-xtensa-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "c9e41389884fb8973b0f789307b2aade11d4bd040f65441f6627e73735f51b2aa89236900259b1b45fce578db3115e92ed4ca59eacbb1bf9f95a03c4a7d99dbd"

RPROVIDES:${PN} += "cross-xtensa-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
