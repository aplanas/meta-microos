SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.89-1.40.aarch64.rpm"
RPM_HASH = "863fe5784e0c8d4b8a8df0f28f604acad5ca2263d4c244d4bd51d2b5bcb414dba2261117d6d251110861ea731078b9bec007c4b6d4e773a13b7dc06cfcecb0ab"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
