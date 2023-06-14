SUMMARY = "Graphical desktop application for updating Flipper Zero firmware"
DESCRIPTION = "Graphical desktop application for updating Flipper Zero firmware \
 \
* Update Flipper's firmware and supplemental data with a press of one button \
* Repair a broken firmware installation \
* Stream Flipper's display and control it remotely \
* Install firmware from a .dfu file \
* Backup and restore settings, progress and pairing data"
LICENSE = "GPL-3.0-or-later"

PV = "1.3.1~rc1+git1.1684488882.0199220"

RPM_NAME = "qFlipper-1.3.1~rc1+git1.1684488882.0199220-1.1.aarch64.rpm"
RPM_HASH = "3b4ff79a13a91a68841996e9f00bd84591d4c325bc144ca0a07923542a8624217dee1a0bd1f9820d44f0806402c8488a7ee7d5b70da421008c8c71f26f55a387"

RPROVIDES:${PN} += "qFlipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickControls2.so.5 \
libQt5SerialPort.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
libz.so.1 \
qFlipper-base \
qFlipper-libflipperproto"

inherit rpm
