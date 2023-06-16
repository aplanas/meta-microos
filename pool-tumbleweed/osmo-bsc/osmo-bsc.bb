SUMMARY = "OsmoBSC: Osmocom's Base Station Controller for 2G CS mobile networks"
DESCRIPTION = "OsmoBSC: Osmocom's Base Station Controller for 2G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-1.8.0-1.11.aarch64.rpm"
RPM_HASH = "39f59dda148a41649ee3c2639e6bc5615320d62fcf144a59cdd709008e8a8df852d23557ff9f311ab6e18acc7c4ddc579bc3c6d563e4dd268f4cd4f341def4a9"

RPROVIDES:${PN} += "config-osmo-bsc \
osmo-bsc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-mgcp-client.so.9 \
libosmo-sigtran.so.7 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmonetif.so.11 \
libosmovty.so.9 \
libtalloc.so.2 \
systemd"

inherit rpm
