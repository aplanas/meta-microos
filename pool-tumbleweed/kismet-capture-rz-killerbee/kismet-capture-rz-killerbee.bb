SUMMARY = "Kismet Killerbee Sniffer capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Killerbee Sniffer capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-rz-killerbee-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "48c8fac1801023302e81a1cbbf9d89971946ac94c68eb6c65229236457ef146acc4b57beba84ef00d7f96a50fafba3decff6a4863d2a91e634d5c3450fe8558e"

RPROVIDES:${PN} += "kismet-capture-rz-killerbee"

RDEPENDS:${PN} += "kismet \
ld-linux-aarch64.so.1 \
libc.so.6 \
libprotobuf-c.so.1 \
libusb-1.0.so.0 \
libwebsockets.so.19"

inherit rpm
