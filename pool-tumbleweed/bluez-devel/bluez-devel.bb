SUMMARY = "Files needed for BlueZ development"
DESCRIPTION = "Files needed to develop applications for the BlueZ Bluetooth protocol \
stack."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-devel-5.66-1.8.aarch64.rpm"
RPM_HASH = "978b636b5c2038ce0c5d1df9f97f0dbddad1424919af9d941d26ca305ca863eb00bec8788b711ab29bc72518dadee7da48e41f0e4e61b5593acf44471c2c3adb"

RPROVIDES:${PN} += "bluez-devel \
pkgconfig-bluez"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluetooth3"

inherit rpm
