SUMMARY = "OsmoBSC: Osmocom's Base Station Controller for 2G CS mobile networks"
DESCRIPTION = "OsmoBSC: Osmocom's Base Station Controller for 2G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-bsc-1.8.0-1.12.aarch64.rpm"
RPM_HASH = "502c90b1c89eba8d2355944ddf46adefa095bdb0bc6a2eeb2c2f15ad8395c3c03be288d89529744ced924f2110568da5522945cca765c9a184a4955b83c2a7ad"

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
