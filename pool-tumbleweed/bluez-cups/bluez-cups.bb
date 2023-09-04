SUMMARY = "CUPS Driver for Bluetooth Printers"
DESCRIPTION = "Contains the files required by CUPS for printing to Bluetooth-connected \
printers."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-cups-5.68-4.1.aarch64.rpm"
RPM_HASH = "fd90006b1bb55fa788fea4c47a08607cda333cd08954bb7cba84475c8d70abb9a9b4883e5239a1e0e7e184828ffb4be4d2dd8c364c450c0bd34e8d721eb23e6c"

RPROVIDES:${PN} += "bluez-cups"

RDEPENDS:${PN} += "bluez \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0"

inherit rpm
