SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "cantor-devel-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "3165537c38119a3e904541acedc91d5a48f7a98953227251221c44578c49cea7972589f319529adce1f9a67d810c3f2c3c007f5935c9b5b543dddd2e6389faea"

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
