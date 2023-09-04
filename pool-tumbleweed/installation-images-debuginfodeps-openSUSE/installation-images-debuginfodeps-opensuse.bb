SUMMARY = "Debuginfo dependencies for openSUSE installation-images"
DESCRIPTION = "Package that holds debuginfo dependencies for image files in installation-image."
LICENSE = "GPL-2.0-or-later"

PV = "17.91"

RPM_NAME = "installation-images-debuginfodeps-openSUSE-17.91-1.67.aarch64.rpm"
RPM_HASH = "c895742b1d95aa53786e9f0a8a2b4c58514ee8eb0805c82cdb2c609f1c655741ec08ba9a32476ead1c25bb443bba3d217328b90cd5c81533fbe8ae28ca4263df"

RPROVIDES:${PN} += "debuginfo-build-id \
installation-images-debuginfodeps \
installation-images-debuginfodeps-openSUSE"

RDEPENDS:${PN} += "debuginfo-build-id"

inherit rpm
