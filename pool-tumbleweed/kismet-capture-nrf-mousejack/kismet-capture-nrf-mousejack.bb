SUMMARY = "Kismet nRF MouseJack capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF MouseJack capture helper. \
https://kismetwireless.net/docs/readme/datasources_nrf_mousejack/"
LICENSE = "GPL-2.0-or-later"

PV = "2023_07_R1"

RPM_NAME = "kismet-capture-nrf-mousejack-2023_07_R1-1.1.aarch64.rpm"
RPM_HASH = "14b6bf2ab72b2bae38f96c5a212ff94783371e72d53b822c03c2065767b1daef01f8fdb6fefe11bfaed4c5a33046dd4918e4ab1d8ce0bbef801970e0757d50c3"

RPROVIDES:${PN} += "kismet-capture-nrf-mousejack"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
