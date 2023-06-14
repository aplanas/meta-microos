SUMMARY = "Libyui - Header files for the Qt REST API plugin"
DESCRIPTION = "This provides a libyui REST API plugin for the Qt frontend. \
 \
This package contains the header files for the plugin. \
 \
This is not needed for using the REST API, only for developing \
extensions for it."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-rest-api-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "06bdbb523c399c556504589ba5209d4b3a742ef3fd6bb6943c636173dfb745a1efb231803d1000cd03cbf0b5093c8e8299b3d91db25064d37e33859678b831de"

RPROVIDES:${PN} += "libyui-qt-rest-api-devel"

RDEPENDS:${PN} += "glibc-devel \
libstdc++-devel \
libyui-qt-devel \
libyui-qt-rest-api16 \
libyui-rest-api-devel"

inherit rpm
