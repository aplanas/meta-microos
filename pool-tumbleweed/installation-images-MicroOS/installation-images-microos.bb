SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-MicroOS-17.91-1.66.aarch64.rpm"
RPM_HASH = "334141fa832109130877853c21a14ab0f89ed43e57b488d4c1addd7b16f543d11ffd00ab202c7fe533fc0d3de24fa23aa030ec4fa9075484117f5e82f765b3a8"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
