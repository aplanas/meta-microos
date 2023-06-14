SUMMARY = "Kismet TICC2531 802.15.4 Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments  TICC2531 802.15.4 \
Zigbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-ti-cc-2531-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "000c1e7b444605e756fe5ddbe8ac1013a2f81accb815ad5f6b13e0771a9447f5c619e98b67edb5c9886928038f3f273e83aac3940321dcb69924279f8e288c83"

RPROVIDES:${PN} += "kismet-capture-ti-cc-2531"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
