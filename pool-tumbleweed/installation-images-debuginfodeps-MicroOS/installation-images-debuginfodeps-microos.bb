SUMMARY = "Debuginfo dependencies for MicroOS installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-MicroOS-17.91-1.83.aarch64.rpm"
RPM_HASH = "c83711ce7ef0243449acd4a015c58a662b0007682f229363fcf91570f200dc8bd420145aca25cedaa8fddca8c448e793f2e4cb84765dff1551a8d98f985726af"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-MicroOS"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
