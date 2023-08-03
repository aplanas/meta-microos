SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.90"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.90-1.24.aarch64.rpm"
RPM_HASH = "9edce9ecf4cfdca6ee5b626410cd43f50719635e3132011fefb5beec2474a2c60e85025aa6c9c9f97dad3a04f13c233b34b895ebc813f6d109fca84dc0516a10"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
