SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.91-1.90.aarch64.rpm"
RPM_HASH = "227335766d308be7ced3d8bb129f5c4218bf716e72361cecfeccd3213757d088e0cb577975636fe59ec38860ad3a5439bcb1c7a1f500f7d94bbed856a0f8b5c9"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
