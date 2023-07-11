SUMMARY = "Virtual Osmocom GSM BTS (no RF hardware; GSMTAP/UDP)"
DESCRIPTION = "This version of OsmoBTS doesn't use actual GSM PHY/Hardware/RF, but \
utilizes GSMTAP-over-UDP frames for the Um interface.  This is useful \
in fully virtualized setups e.g. in combination with OsmocomBB virt_phy."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "osmo-bts-virtual-1.4.0-1.11.aarch64.rpm"
RPM_HASH = "ce2c7c95e9f1610fffa83af52d6fd24d3cedd90a24fbe4a1bb39741823d92a2eee14e99ece1839e01fe8cbc35c6ef2134ae925825cb6612b809bde3274a861e4"

RPROVIDES:${PN} += "config-osmo-bts-virtual \
osmo-bts-virtual"

RDEPENDS:${PN} += "/usr/bin/sh \
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
