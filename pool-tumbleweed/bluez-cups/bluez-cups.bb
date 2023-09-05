SUMMARY = "CUPS Driver for Bluetooth Printers"
DESCRIPTION = "Contains the files required by CUPS for printing to Bluetooth-connected \
printers."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-cups-5.68-4.2.aarch64.rpm"
RPM_HASH = "1a6b5a97df54da4c6046b7b43314af7ea8e374b860f827f62f7b10850f92685b49795a4c8fea9dcf92c5af45d6ca72f89720f73b0b321bcf61dce3fe63885a57"

RPROVIDES:${PN} += "bluez-cups"

RDEPENDS:${PN} += "bluez \
cups \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0"

inherit rpm
