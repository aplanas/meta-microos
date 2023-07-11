SUMMARY = "A tool for in-depth analysis of USB HID devices communication"
DESCRIPTION = "Hidviz is a GUI application for in-depth analysis of USB HID class devices. \
The 2 main usecases of this application are reverse-engineering existing \
devices and developing new USB HID devices."
LICENSE = "GPL-3.0-or-later"

PV = "0.2"

RPM_NAME = "hidviz-0.2-1.4.aarch64.rpm"
RPM_HASH = "b45a925792eaecfb20b360bd5544da951e9ccc807e11d02533ae652b3b707bf250bc3607c3559725e57a62567354227cb7c8a94f7904db61fc52fc20dc2c1981"

RPROVIDES:${PN} += "hidviz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf-3.21.12.so \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
