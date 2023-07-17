SUMMARY = "bluez-qt integration with udev"
DESCRIPTION = "Async Bluez wrapper library. \
Udev rules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "bluez-qt-udev-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "1d5e1eb087d8f401f361caebf2af155f4f286abd804718d47a795251588c4b99cabb811a6195ce6f689d82311ead1ca699642ef0b483e61b267aa189e3967743"

RPROVIDES:${PN} += "bluez-qt-udev"

RDEPENDS:${PN} += "udev"

inherit rpm
