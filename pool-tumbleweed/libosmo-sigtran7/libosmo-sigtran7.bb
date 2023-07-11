SUMMARY = "Osmocom SIGTRAN library"
DESCRIPTION = "Osmocom implementation of (parts of) SIGTRAN."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "libosmo-sigtran7-1.7.0-1.2.aarch64.rpm"
RPM_HASH = "f0151f86237ead17688f99f41ecc901f9b564d7c6132c24712e240313dc96a42f24d1c78c7e6dfc6023456a7016cbd9626a41dac24f076e327b51319640beb83"

RPROVIDES:${PN} += "libosmo-sigtran.so.7 \
libosmo-sigtran7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.20 \
libosmogsm.so.18 \
libosmonetif.so.11 \
libosmovty.so.9 \
libsctp.so.1 \
libtalloc.so.2"

inherit rpm
