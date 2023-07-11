SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-MicroOS-17.89-1.31.aarch64.rpm"
RPM_HASH = "9ef6f50aa084dab5b6cfed4f837d81fbdebd721627ae0c199926b0253df0cbdcc95fbf5af3362f34b691386056bc3b5bf7a3e232388e6cea595149f3b1c8b6b7"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
