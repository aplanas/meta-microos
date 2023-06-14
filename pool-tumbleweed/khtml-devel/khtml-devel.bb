SUMMARY = "HTML rendering engine"
DESCRIPTION = "KHTML is a web rendering engine, based on the KParts \
technology and using KJS for JavaScript support. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "khtml-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "7aa79239e15eca761a55c65424a01ff672efef55dec8ebe801c002474ca1d1635f1852fa933b07f40d32813f46d79726cc12fe732503ae7149333d1f3b363b39"

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
