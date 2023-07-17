SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.89-1.40.aarch64.rpm"
RPM_HASH = "746359be3ebb0a07580dbe16147dcb09a5e3b873c0ea4bc61b9efb03ec1f8f1932c4ad1f3bafd3cd3cacf6299ae28ff18157d1729a276f7007a949c0bdcaee8c"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
