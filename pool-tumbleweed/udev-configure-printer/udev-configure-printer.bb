SUMMARY = "Utility to autoconfigure printers when plugged"
DESCRIPTION = "This package contains an utility that will ensure printers get \
automatically configured when plugged on the computer."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "udev-configure-printer-1.5.18-2.2.aarch64.rpm"
RPM_HASH = "27854c86a3456abebeab2a1633042842f1501809ec933290d95eef3813efdb19f6fa45e6ea8763b2f0776d52ebf03cd8d6f421a3a0f6ccd0b8f949038ecbdb8d"

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
