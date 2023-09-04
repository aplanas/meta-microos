SUMMARY = "Kismet TICC2531 802.15.4 Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments  TICC2531 802.15.4 \
Zigbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-ti-cc-2531-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "69f5f8f5291b6d4cf50d723a4c6ef7b1ecb35f79abf76257df8e2c4f77c008d1f1a45f4af0e8ab0eebbbdb923df8069c158093b8014e74e47dfc9b233f19317e"

RPROVIDES:${PN} += "kismet-capture-ti-cc-2531"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
