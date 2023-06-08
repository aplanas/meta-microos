SUMMARY = "bluez-qt integration with udev"
DESCRIPTION = "Async Bluez wrapper library. \
Udev rules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "bluez-qt-udev-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "f7cd749f9f2fd96ce1b3c73ef6b4e7ee7ba372b035c37816c4e64804ba3d21e04c6b8c8348d9c89470fdfc382fad918c96548efd4dbb9fdc81fbca5c10fd1c8a"

RPROVIDES:${PN} += "bluez-qt-udev bluez-qt-udev(aarch-64)"
RDEPENDS:${PN} += "udev"

inherit rpm
