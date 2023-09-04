SUMMARY = "Utility to autoconfigure printers when plugged"
DESCRIPTION = "This package contains an utility that will ensure printers get \
automatically configured when plugged on the computer."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.18"

RPM_NAME = "udev-configure-printer-1.5.18-3.1.aarch64.rpm"
RPM_HASH = "0663efcabbcea5262511c6aca5525d6245cdbb2e58ea2e210807eab2e25feb4f2ffa9d9b777889a492e44c1cea88a4cbe70e4839db94cb9672d58c96922b9ee0"

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
