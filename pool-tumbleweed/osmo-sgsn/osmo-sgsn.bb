SUMMARY = "Osmocom's SGSN for 2G and 3G packet-switched mobile networks"
DESCRIPTION = "OsmoSGSN is Osmocom's Serving GPRS Support Node for 2G and 3G \
packet-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-sgsn-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "c7fb306db7e4ff6c7010b750d47f06237319f0fe845e350b3ecb993133144c5e68345f059588aec8b5d5183ff079f591e79e89e0b72fddac569a1b1279edbcc8"

RPROVIDES:${PN} += "config(osmo-sgsn) \
osmo-sgsn \
osmo-sgsn(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcares.so.2()(64bit) \
libgtp.so.6()(64bit) \
libosmo-gsup-client.so.0()(64bit) \
libosmo-ranap.so.7()(64bit) \
libosmo-sigtran.so.7()(64bit) \
libosmocore.so.20()(64bit) \
libosmoctrl.so.0()(64bit) \
libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) \
libosmogb.so.14()(64bit) \
libosmogb.so.14(LIBOSMOGB_1.0)(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
systemd"

inherit rpm
