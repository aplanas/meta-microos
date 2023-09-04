SUMMARY = "bluez-qt integration with udev"
DESCRIPTION = "Async Bluez wrapper library. \
Udev rules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "bluez-qt-udev-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0314f5e05801ef33e140cfcaf6d7809140977c1bbc1156c163664e98cd6310b058b01dcd1277e1b776430fd2a4657d3611619000628c713638de4c365c9caf65"

RPROVIDES:${PN} += "bluez-qt-udev"

RDEPENDS:${PN} += "udev"

inherit rpm
