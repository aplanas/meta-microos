SUMMARY = "OsmoBSC: Osmocom's Base Station Controller for 2G CS mobile networks"
DESCRIPTION = "OsmoBSC: Osmocom's Base Station Controller for 2G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "39f59dda148a41649ee3c2639e6bc5615320d62fcf144a59cdd709008e8a8df852d23557ff9f311ab6e18acc7c4ddc579bc3c6d563e4dd268f4cd4f341def4a9"

RPROVIDES:${PN} += "config(osmo-bsc) \
osmo-bsc \
osmo-bsc(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libosmo-mgcp-client.so.9()(64bit) \
libosmo-sigtran.so.7()(64bit) \
libosmoabis.so.10()(64bit) \
libosmocore.so.20()(64bit) \
libosmoctrl.so.0()(64bit) \
libosmoctrl.so.0(LIBOSMOCTRL_1.0)(64bit) \
libosmogsm.so.18()(64bit) \
libosmogsm.so.18(LIBOSMOGSM_1.0)(64bit) \
libosmonetif.so.11()(64bit) \
libosmovty.so.9()(64bit) \
libtalloc.so.2()(64bit) \
libtalloc.so.2(TALLOC_2.0.2)(64bit) \
systemd"

inherit rpm
