SUMMARY = "HTML rendering engine"
DESCRIPTION = "KHTML is a web rendering engine, based on the KParts \
technology and using KJS for JavaScript support. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "khtml-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "9939160dc07175035825cdf41cb8a9bcefcd7b8b529f8a5d2e26ca6c0461c4329897596e51b25f41796d88c568d1b80efdd3eeb98507b96f00ebc65cf4ff6c78"

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
