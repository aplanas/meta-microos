SUMMARY = "Kismet Killerbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Killerbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-rz-killerbee-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "fb5b25fb25c2eb087b7cf0aa02de86f99fa12531c4fa62d25ba46b76ec253605b82554cc6543bc332f04723ea513018bdb34cd1ce9716c8179001841b963ca57"

RPROVIDES:${PN} += "kismet-capture-rz-killerbee"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
