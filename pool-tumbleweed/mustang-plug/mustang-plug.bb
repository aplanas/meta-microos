SUMMARY = "Software for Fender Mustang amps"
DESCRIPTION = "Graphical interface to control amplifier and effect stages \
of Fender Mustang guitar amplifiers."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "mustang-plug-1.4.3-2.1.aarch64.rpm"
RPM_HASH = "0ca2f15a68af7eab78a4be217ae71232a6b9970f995f454a0a15ba0a1ca8924adda0c84efd91b7d5d38b9d4c2f148b0b272d8afae2b4a38e2451ab6e2f87b0f3"

RPROVIDES:${PN} += "mustang-plug"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
