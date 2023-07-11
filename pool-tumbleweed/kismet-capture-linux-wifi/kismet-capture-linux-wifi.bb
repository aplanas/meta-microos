SUMMARY = "Kismet Linux WiFi capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains Kismet Linux WiFi capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-linux-wifi-2022_08_R1-2.5.aarch64.rpm"
RPM_HASH = "4f9f8fcdc987e169154cf80bd06de7ec95662def80f6891be86160b667bd044e5b8ba90aea8a1a9e2251342a3506dd8b3c1454e6ebb0db5baf104fca7bc59da3"

RPROVIDES:${PN} += "kismet-capture-linux-wifi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgobject-2.0.so.0 \
libm.so.6 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libnm.so.0 \
libpcap.so.1 \
libprotobuf-c.so.1 \
libwebsockets.so.19"

inherit rpm
