SUMMARY = "Provides libknet1 nss support"
DESCRIPTION = "Provides NSS crypto support for libknet1."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "1.21"

RPM_NAME = "libknet1-crypto-nss-plugin-1.21-1.10.aarch64.rpm"
RPM_HASH = "779ce13ebc18f23179fad2ffb63b498341a3011f2969457a8db938404920bc55c7255947e25c90c63f1a21e49bbddd70c8b3e6da937e3ae6fd09ea38ab8ed2a5"

RPROVIDES:${PN} += "libknet1-crypto-nss-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libknet1 \
libnspr4.so \
libnss3.so \
libplds4.so"

inherit rpm
