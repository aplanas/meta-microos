SUMMARY = "Kismet NXP KW41Z BTLE and Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the NXP KW41Z BTLE and Zigbee Sniffer capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-nrf-nxp-kw41z-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "64987d19a14bfa2589fa45bb9a05dcd901db6f8789a335fc0a647a9b81db7d005d110aa6f0d4812f5463d61ccbb6129ce3544c25c8787d8cbfec22b5a6975408"

RPROVIDES:${PN} += "kismet-capture-nrf-nxp-kw41z"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
