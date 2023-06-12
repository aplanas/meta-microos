SUMMARY = "Files needed for BlueZ development"
DESCRIPTION = "Files needed to develop applications for the BlueZ Bluetooth protocol \
stack."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-devel-5.66-1.6.aarch64.rpm"
RPM_HASH = "3128dab83aa991c63960986af752b43ed98e58a562866e1453aeee49c5586314bc174202df0354adfb418ce2306cb47b7fd925fce5b1ede6467f6a9ffe758f15"

RPROVIDES:${PN} += "bluez-devel \
bluez-devel(aarch-64) \
pkgconfig(bluez)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluetooth3"

inherit rpm
