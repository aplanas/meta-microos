SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.89-1.31.aarch64.rpm"
RPM_HASH = "e68246081a4dd8887c114918ee2c1b350e93839c410759b763068979928ceee0bcc3fb8c32b23110bacf48fdd6cb5f740b8f5302e7f6072b3e3c22513126098e"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
