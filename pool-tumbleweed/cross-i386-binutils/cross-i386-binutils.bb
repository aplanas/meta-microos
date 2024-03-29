SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-i386-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "a2105432581e4b452e0922c6442309442be4cd88e4712ae03c23280fb89f0e6e0ed2139162c8be2affb0d12235a891f251f16f2bcf8789a1da9ac80420d7f513"

RPROVIDES:${PN} += "cross-i386-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
