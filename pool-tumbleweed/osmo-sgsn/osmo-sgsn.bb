SUMMARY = "Osmocom's SGSN for 2G and 3G packet-switched mobile networks"
DESCRIPTION = "OsmoSGSN is Osmocom's Serving GPRS Support Node for 2G and 3G \
packet-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-sgsn-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "ddb4191e7b21da5f603674e0b4e22f1a6edac9ebe47860acee923da004341fc6ffb38e2f5fa60c4fee08b148d5c126f444dfb7f84e3eaa3022842dc0cb9e61f4"

RPROVIDES:${PN} += "config-osmo-sgsn \
osmo-sgsn"

RDEPENDS:${PN} += "/usr/bin/sh \
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
