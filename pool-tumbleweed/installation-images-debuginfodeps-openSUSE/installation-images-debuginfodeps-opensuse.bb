SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.87"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.87-1.8.aarch64.rpm"
RPM_HASH = "bb647b0b67a82589d6196a54f24a5bbddbdcdf93f71a1376fe29227048862b9fbdfef03ebb21a13bfa3bdd3da019f860af29ce27700081a704ac9a4675d28639"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
