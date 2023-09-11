SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-MicroOS-17.91-1.88.aarch64.rpm"
RPM_HASH = "ae3cc81b6cf80bd0ba95b9740712a9eca06a31cb2d5f25168b35c2d01ca87eebc904ac2a5e71de74990e9728346a3ddd8c66d0b66a1c7d20acc50729a1dd4f6b"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
