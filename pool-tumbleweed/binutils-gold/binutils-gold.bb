SUMMARY = "The gold linker"
DESCRIPTION = "gold is an ELF linker.	It is intended to have complete support for ELF \
and to run as fast as possible on modern systems.  For normal use it is \
a drop-in replacement for the older GNU linker."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-gold-2.40-5.1.aarch64.rpm"
RPM_HASH = "a6be5f2773aedf9d64d665a828270ca472f046ab79946b6f35780dce627489dc4bc1b2d79419dec7da9561f0b0e552a826ca3e43253a5d9e655c8d2c83e496bd"

RPROVIDES:${PN} += "binutils-gold"

RDEPENDS:${PN} += "/bin/sh \
binutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
