SUMMARY = "Virtual Osmocom GSM BTS (no RF hardware; GSMTAP/UDP)"
DESCRIPTION = "This version of OsmoBTS doesn't use actual GSM PHY/Hardware/RF, but \
utilizes GSMTAP-over-UDP frames for the Um interface.  This is useful \
in fully virtualized setups e.g. in combination with OsmocomBB virt_phy."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-bts-virtual-1.4.0-1.10.aarch64.rpm"
RPM_HASH = "d4dd67469050467cbeeb5422bee2edfb35d180706d85a1c3ced99f85fcd137ca555daf55c26a0391fb6e48ba79ec23c3075f34256d26e065f9283e19e7b64165"

RPROVIDES:${PN} += "config-osmo-bts-virtual \
osmo-bts-virtual"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.10 \
libosmocore.so.20 \
libosmoctrl.so.0 \
libosmogsm.so.18 \
libosmotrau.so.2 \
libosmovty.so.9 \
libtalloc.so.2"

inherit rpm
