SUMMARY = "The gold linker"
DESCRIPTION = "gold is an ELF linker.	It is intended to have complete support for ELF \
and to run as fast as possible on modern systems.  For normal use it is \
a drop-in replacement for the older GNU linker."
LICENSE = "GPL-3.0-or-later"

PV = "2.40"

RPM_NAME = "binutils-gold-2.40-5.3.aarch64.rpm"
RPM_HASH = "4268179252b08e41907b0072446926d791021ec2d019fbac8323ac3c3a5927eb59ef9826e8c8f7c94221f44f91a463aa7ef5ee1e17e9d7659178440fcb8b1bdc"

RPROVIDES:${PN} += "binutils-gold"

RDEPENDS:${PN} += "/usr/bin/sh \
binutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1 \
update-alternatives"

inherit rpm
