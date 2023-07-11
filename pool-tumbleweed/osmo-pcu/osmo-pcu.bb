SUMMARY = "Osmocom GPRS Packet Control Unit (PCU)"
DESCRIPTION = "Osmocom PCU code (RLC/MAC/PCU) for OpenBTS and OsmoBTS."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "osmo-pcu-1.0.0-1.11.aarch64.rpm"
RPM_HASH = "7229a80f50d47633011033669adf2e5ff5cac568349c3b916cd397ac57e135316b3d21f8af685ede9e365a3acba90fe62474da6317756809016c4a37e11aa481"

RPROVIDES:${PN} += "config-osmo-pcu \
osmo-pcu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogb.so.14 \
libosmogsm.so.18 \
libosmovty.so.9 \
libstdc++.so.6 \
libtalloc.so.2"

inherit rpm
