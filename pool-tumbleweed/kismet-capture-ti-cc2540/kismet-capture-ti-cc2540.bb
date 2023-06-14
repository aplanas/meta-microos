SUMMARY = "Kismet TI CC2540 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments CC2540 BTLE capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-ti-cc2540-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "74509c075b780c7b70ea0f2eb67065241d953eab3972603e84f3557c254396e63cf044a7522d95a937ba779656c79d9680bf877162d1620e047cb0614bef453a"

RPROVIDES:${PN} += "kismet-capture-ti-cc2540"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
