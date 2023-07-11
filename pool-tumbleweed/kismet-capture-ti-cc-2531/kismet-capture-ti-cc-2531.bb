SUMMARY = "Kismet TICC2531 802.15.4 Zigbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments  TICC2531 802.15.4 \
Zigbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-ti-cc-2531-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "2e86784c280574bde8edf5009ceab46f3891587370512319577c1501582bad38eb26bf19a60161fdf8960c49c50a6c0c8a1988577cef252828c34f053bc7bafe"

RPROVIDES:${PN} += "kismet-capture-ti-cc-2531"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
