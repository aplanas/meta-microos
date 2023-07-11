SUMMARY = "Kismet NXP KW41Z BTLE and Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the NXP KW41Z BTLE and Zigbee Sniffer capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-nxp-kw41z-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "47d856a55173043f8e611efe476fb36e5f85ad0a15a6ec387b01118e635ff3657cb29aa3153c5d8fde58477e24ece93d788ee2adac6afbc5c7a109a1737a1882"

RPROVIDES:${PN} += "kismet-capture-nrf-nxp-kw41z"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
