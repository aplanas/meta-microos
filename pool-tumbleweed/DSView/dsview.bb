SUMMARY = "GUI for DreamSourceLab USB-based instruments"
DESCRIPTION = "GUI for DreamSourceLab USB-based instruments"
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "DSView-1.2.2-1.4.aarch64.rpm"
RPM_HASH = "aaa20ba23e6c639fe01f95594042fc103b8cc7635a32cc2dcd89260c7f26ec2ffd8a0b7cbb6f126d95463bcfd1130cd514917d937b35da9082852e13f558dd3e"

RPROVIDES:${PN} += "DSView"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libfftw3.so.3 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libm.so.6 \
libpython3.11.so.1.0 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1"

inherit rpm
