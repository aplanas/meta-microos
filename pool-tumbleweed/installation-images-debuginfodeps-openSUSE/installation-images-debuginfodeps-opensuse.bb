SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.89"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.89-1.31.aarch64.rpm"
RPM_HASH = "29de70bfb5a2d1aebd26567ad3cfc7fe5611f10158672e55b84a5a9fb32055dc9ce8a67504b3834d813bea791bd6b087bd1acbb1d87990268641b6c8fa3c3581"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
