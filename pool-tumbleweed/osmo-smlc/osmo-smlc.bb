SUMMARY = "Osmocom Serving Mobile Location Centre"
DESCRIPTION = "OsmoSMLC is the Osmocom Serving Mobile Location Centre. It implements \
the SMLC functionality as specified in 3GPP networks \
Location_Services architecture."
LICENSE = "AGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "osmo-smlc-0.2.3-1.1.aarch64.rpm"
RPM_HASH = "7d9774d45ea11c9367f3512e5e91d6dcb1d88001b8c8bee2c9ec45371505e71cf4fd0178fd69e665d3ea59769095ef5212f514cb22c5ddb3c2f10dc1ed28f572"

RPROVIDES:${PN} += "osmo-smlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
