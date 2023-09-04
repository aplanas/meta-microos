SUMMARY = "HTML rendering engine"
DESCRIPTION = "KHTML is a web rendering engine, based on the KParts \
technology and using KJS for JavaScript support. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "khtml-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "652980397bf25d03611b398c339eddde313ed3da0673efae198dc615e9c8b5e70716011f08725e402966e1856ce3aded0cebcb430b0e10275a47061ea37d1a90"

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
