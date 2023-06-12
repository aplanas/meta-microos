SUMMARY = "bluez-qt integration with udev"
DESCRIPTION = "Async Bluez wrapper library. \
Udev rules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "bluez-qt-udev-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "a3fc437ea568fb2191c62eba49e5bec9acdb2cd3ac8717128735ab1359edf38b4fb58e208bf1c0b597a7e71cd456e3a4cbcebd7aa9628c4ee1ee5e9443913240"

RPROVIDES:${PN} += "bluez-qt-udev \
bluez-qt-udev(aarch-64)"
RDEPENDS:${PN} += "udev"

inherit rpm
