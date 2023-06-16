SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-pru-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "22dcd8243c8890a31e03bdb030bfde0267a0a0b2fd8b133f6f2f0b652d8feec7e86f3000102816d5a069c4a69fa7199047c46fdd9ab74691c7c08f7acbdd38c5"

RPROVIDES:${PN} += "cross-pru-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
