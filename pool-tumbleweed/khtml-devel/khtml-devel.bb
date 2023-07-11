SUMMARY = "HTML rendering engine"
DESCRIPTION = "KHTML is a web rendering engine, based on the KParts \
technology and using KJS for JavaScript support. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "khtml-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "01943f0b79a8c23854abfe0f3cedd49e77b2b2eac8ad16c621267e9c9fa5b28dc5d776c0b1d3074722677bc0066ac43eef58c6ae2ff96c3474fa96949d8e3fea"

RPROVIDES:${PN} += "cmake-KF5KHtml \
khtml-devel"

RDEPENDS:${PN} += "cmake-KF5Codecs \
cmake-KF5I18n \
cmake-KF5JS \
cmake-KF5KIO \
cmake-KF5Parts \
cmake-KF5TextWidgets \
cmake-Qt5Gui \
extra-cmake-modules \
libKF5KHtml5"

inherit rpm
