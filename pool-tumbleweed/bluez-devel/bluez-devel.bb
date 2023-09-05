SUMMARY = "Files needed for BlueZ development"
DESCRIPTION = "Files needed to develop applications for the BlueZ Bluetooth protocol \
stack."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-devel-5.68-4.2.aarch64.rpm"
RPM_HASH = "2bcbb47b14acc0b4a59597d42582bbaba0e03d7dddae91db519a9db7d820369afd6710525e6f438e2f15d611986eccee862c27d48d245f69a0d1b64aa3dd16b4"

RPROVIDES:${PN} += "bluez-devel \
pkgconfig-bluez"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluetooth3"

inherit rpm
