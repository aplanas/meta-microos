SUMMARY = "Files needed for BlueZ development"
DESCRIPTION = "Files needed to develop applications for the BlueZ Bluetooth protocol \
stack."
LICENSE = "GPL-2.0-or-later"

PV = "5.69"

RPM_NAME = "bluez-devel-5.69-1.1.aarch64.rpm"
RPM_HASH = "df8a6f754355e52e4d77b8ed588953e340e0ac0f2859d8c201bb636d6339f0f83ca9035660d23e3b4f826e6a5b9703ec7baedee322293c50e0c47487e652effc"

RPROVIDES:${PN} += "bluez-devel \
pkgconfig-bluez"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbluetooth3"

inherit rpm
