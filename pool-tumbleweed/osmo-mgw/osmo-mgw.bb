SUMMARY = "Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks"
DESCRIPTION = "OsmoMGW is Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "osmo-mgw-1.9.0-1.10.aarch64.rpm"
RPM_HASH = "cd2176d40b95b4c5c3fe34a2bad3e273421cd7cb42f7dd7fdae421d27ddf940255efb1e1e0ea8375afd6a55c717c92120175653040c07a0e4746d7980c59cd99"

RPROVIDES:${PN} += "config-osmo-mgw \
osmo-mgw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmoisdn.so.0 \
libosmonetif.so.11 \
libosmotrau.so.2 \
libosmovty.so.9 \
libtalloc.so.2 \
systemd"

inherit rpm
