SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "cantor-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "1c50ba4b37d2b640fe7988d3e1661eec2fdf895aea0f72ad290501c7e42632684eb8d83ba7843a77668dc7464efd072c51438617a0f14c4d338a8ed2d81af9a3"

RPROVIDES:${PN} += "cantor-devel cantor-devel(aarch-64) cmake(Cantor)"
RDEPENDS:${PN} += "cmake(KF5Archive) cmake(KF5Completion) cmake(KF5Config) cmake(KF5I18n) cmake(KF5IconThemes) cmake(KF5KIO) cmake(KF5XmlGui) cmake(Qt5Svg) cmake(Qt5Xml) libcantorlibs28 libpoppler-qt5-devel libspectre-devel"

inherit rpm
