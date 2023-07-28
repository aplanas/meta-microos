SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.89-1.57.aarch64.rpm"
RPM_HASH = "53f8d471661fab7286c1cd823ca14f1a7bd48c5ea7dac864c0cf474873408a3ee9ecaa8be0134c154fd5f1ecc2063faf521a05208b3cd5656212af8f507a4d75"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
