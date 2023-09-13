SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.91-1.98.aarch64.rpm"
RPM_HASH = "6e981d5e2c4e7653288989e951d6c5a23c345f122d4fd45db69bc37e2ae78cf62407083f59c0ffcec1b6b1a459ffdb52a35b16e24f74ce8936a93485379e8a78"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
