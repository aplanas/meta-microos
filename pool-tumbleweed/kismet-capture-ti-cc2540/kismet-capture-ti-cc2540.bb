SUMMARY = "Kismet TI CC2540 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments CC2540 BTLE capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-ti-cc2540-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "16f2e270d6ef37a14d1a345355458bcd76fc8bc84ae4f1af8de19b8043aa5e2eb948a7fe79963423aca2d66c8b854cade85e14de070cecb1916571c6cce2b10d"

RPROVIDES:${PN} += "kismet-capture-ti-cc2540"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
