SUMMARY = "Files needed for BlueZ development"
DESCRIPTION = "Files needed to develop applications for the BlueZ Bluetooth protocol \
stack."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-devel-5.68-4.1.aarch64.rpm"
RPM_HASH = "b2401002ad4243bd0bd829c855e11cf5076e1fd85b3909f83e28ffcd45b9d9d8834fd06d286abcba74586fd3bbcd4aabb43193df58b3a9439df8881078392531"

RPROVIDES:${PN} += "bluez-devel \
pkgconfig-bluez"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluetooth3"

inherit rpm
