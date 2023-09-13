SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.91-1.100.aarch64.rpm"
RPM_HASH = "852a22c5b786255bae819fc514f37b75f3ef965e8f9600ec642f350896d50d0df3c30f27bc146ac7df16fcbdb9ca1a190fea4d136769e6285c0f2e5b1cef0b19"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
