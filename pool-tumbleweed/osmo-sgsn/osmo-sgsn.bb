SUMMARY = "Osmocom's SGSN for 2G and 3G packet-switched mobile networks"
DESCRIPTION = "OsmoSGSN is Osmocom's Serving GPRS Support Node for 2G and 3G \
packet-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-sgsn-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "c7fb306db7e4ff6c7010b750d47f06237319f0fe845e350b3ecb993133144c5e68345f059588aec8b5d5183ff079f591e79e89e0b72fddac569a1b1279edbcc8"

RPROVIDES:${PN} += "config-osmo-sgsn \
osmo-sgsn"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libgtp.so.6 \
libosmo-gsup-client.so.0 \
libosmo-ranap.so.7 \
libosmo-sigtran.so.7 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogb.so.14 \
libosmogsm.so.18 \
libosmovty.so.9 \
libtalloc.so.2 \
systemd"

inherit rpm
