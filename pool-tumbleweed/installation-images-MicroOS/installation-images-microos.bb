SUMMARY = "Installation Image Files for MicroOS"
DESCRIPTION = "Files needed for MicroOS installation media."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "installation-images-MicroOS-17.90-1.30.aarch64.rpm"
RPM_HASH = "c29e6bcd06b0113e73cbde9520652eab782bd0ba3733df1d8961bd4cf8acaf09a7133a5b5ef0ee1cb7facb4eed33c4813865efe8edfdd4a533b0b91d3a0f37a1"

RPROVIDES:${PN} += "installation-images \
installation-images-MicroOS"

RDEPENDS:${PN} += ""

inherit rpm
