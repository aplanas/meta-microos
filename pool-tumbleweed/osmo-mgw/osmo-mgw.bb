SUMMARY = "Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks"
DESCRIPTION = "OsmoMGW is Osmocom's Media Gateway for 2G and 3G circuit-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.9.0"

RPM_NAME = "osmo-mgw-1.9.0-1.11.aarch64.rpm"
RPM_HASH = "38252a2e05e525473cad3a06db681ae657c0b61158220e9f346dbb8ff13049e5a1f015b9ecc50961196247eab4f963fbaf4bc5d3a7a998ef338bef6561a906e3"

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
