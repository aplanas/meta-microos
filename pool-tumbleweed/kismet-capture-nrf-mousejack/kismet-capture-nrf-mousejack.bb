SUMMARY = "Kismet nRF MouseJack capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the nRF MouseJack capture helper. \
https://kismetwireless.net/docs/readme/datasources_nrf_mousejack/"
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-nrf-mousejack-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "c53c5cc0e1b8ea02755db240b6606ad8a8ab236f1b01a913258c753c43d3ed8a77a62bd178fdf355036f64639d263886ffe1eede68089f90720e3615181eb2fc"

RPROVIDES:${PN} += "kismet-capture-nrf-mousejack"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
