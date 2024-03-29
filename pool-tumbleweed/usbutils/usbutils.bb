SUMMARY = "Tools and libraries for USB devices"
DESCRIPTION = "This package contains a utility for inspecting devices connected to USB \
ports."
LICENSE = "GPL-2.0-or-later"

PV = "015"

RPM_NAME = "usbutils-015-1.3.aarch64.rpm"
RPM_HASH = "41d3b8a0b5b044e3e0e54aa655d20b69701c2f1c3f6baea6b1d4488e37e4ee47c61c96694e08133a12af17c629d233dc89da5a99b547f047e3e3ee46041f9b89"

RPROVIDES:${PN} += "usbutils"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
hwdata \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1 \
libusb-1.0.so.0"

inherit rpm
