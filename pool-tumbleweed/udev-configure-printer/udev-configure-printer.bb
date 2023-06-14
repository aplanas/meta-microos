SUMMARY = "Utility to autoconfigure printers when plugged"
DESCRIPTION = "This package contains an utility that will ensure printers get \
automatically configured when plugged on the computer."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "udev-configure-printer-1.5.18-2.1.aarch64.rpm"
RPM_HASH = "b7417193c136c942604b2456c6f8ee9656aa4345bd67b07dc943193cc39a56d20b3d6798414b7eb627d1205096df6737e92235c49fa3cd278a4bda748069e44b"

RPROVIDES:${PN} += "udev-configure-printer"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libglib-2.0.so.0 \
libudev.so.1 \
libusb-1.0.so.0 \
python3-cups \
python3-cupshelpers \
systemd"

inherit rpm
