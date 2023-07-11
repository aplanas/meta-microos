SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "cantor-devel-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "9b706f982c4a64c081844257de17a09daeb7e615fd748a70688c30036ebfdb8008d4ae4fbcf8bc98f68c6bd9f429bec6f171b1366a2a37689f58a2511df3d535"

RPROVIDES:${PN} += "cantor-devel \
cmake-Cantor"

RDEPENDS:${PN} += "cmake-KF5Archive \
cmake-KF5Completion \
cmake-KF5Config \
cmake-KF5I18n \
cmake-KF5IconThemes \
cmake-KF5KIO \
cmake-KF5XmlGui \
cmake-Qt5Svg \
cmake-Qt5Xml \
libcantorlibs28 \
libpoppler-qt5-devel \
libspectre-devel"

inherit rpm
