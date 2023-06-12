SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "cantor-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "1fd11af82b2fdb12d6cb9bbdb3525aa8bd5173f895b324107ed95d24858ac9f1d37e414a32e7c57045914c179e6bc845bd4f620f4f79fd3ca8de41837b4cadc4"

RPROVIDES:${PN} += "cantor-devel \
cantor-devel(aarch-64) \
cmake(Cantor)"
RDEPENDS:${PN} += "cmake(KF5Archive) \
cmake(KF5Completion) \
cmake(KF5Config) \
cmake(KF5I18n) \
cmake(KF5IconThemes) \
cmake(KF5KIO) \
cmake(KF5XmlGui) \
cmake(Qt5Svg) \
cmake(Qt5Xml) \
libcantorlibs28 \
libpoppler-qt5-devel \
libspectre-devel"

inherit rpm
