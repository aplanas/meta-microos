SUMMARY = "GNU Binutils"
DESCRIPTION = "C compiler utilities: ar, as, gprof, ld, nm, objcopy, objdump, ranlib, \
size, strings, and strip. These utilities are needed whenever you want \
to compile a program or kernel."
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "cross-x86_64-binutils-2.40-5.1.aarch64.rpm"
RPM_HASH = "6d02dce73d6ea259e8f9fc00521cd8d01296b6a7a4c72392ab6cc43a1a8321b79c75248627a4964e243c7f9b9912b5eeaa40a09efca5d4de0396b9ab0c75b985"

RPROVIDES:${PN} += "cross-x86-64-binutils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
