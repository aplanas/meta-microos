SUMMARY = "Kismet TI CC2540 (BTLE) capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Texas Instruments CC2540 BTLE capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-ti-cc2540-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "b9422de246c12da7bd0337bb07fca8035f507219ab30cd77f55943ba0bb4c32841701b4a70ec73672a49fc03e416210e6292a1587a24ac4d78b64933ebe2bb5c"

RPROVIDES:${PN} += "kismet-capture-ti-cc2540"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
