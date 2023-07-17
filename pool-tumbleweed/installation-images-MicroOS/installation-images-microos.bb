SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-MicroOS-17.89-1.40.aarch64.rpm"
RPM_HASH = "0afa9bbf5bfd1ed4a511242ad54ce355f1761426669845f89b16c655dfdb86a8a4e12260aac5ba61fe709fad406b36b07c547410f0d3c7adc80851bbfff8a870"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
