SUMMARY = "bluez-qt integration with udev"
DESCRIPTION = "Async Bluez wrapper library. \
Udev rules."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "bluez-qt-udev-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "c6ffa89753f4a6a5e429d5f8a065f4dab9e42484d3aa88f61fc5b3609a8ca2c91529538487144d8d5aa0b4e5e154050b87b82d2a2c5363d29c7e4aa6e0d52c5d"

RPROVIDES:${PN} += "bluez-qt-udev"

RDEPENDS:${PN} += "udev"

inherit rpm
