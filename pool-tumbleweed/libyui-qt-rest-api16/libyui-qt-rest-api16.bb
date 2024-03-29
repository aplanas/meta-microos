SUMMARY = "Libyui - The REST API plugin for the Qt frontend"
DESCRIPTION = "This package provides a libyui REST API plugin for the Qt frontend. \
 \
It allows inspecting and controlling the UI remotely via \
an HTTP REST API. This is designed for automated tests."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "4.6.0"

RPM_NAME = "libyui-qt-rest-api16-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "8dec1ea698d7456f32b95a3cfdeb515c0f596d58146422b09971acc49302feffd8819cb843c0ccbdb236dccc943e03d6eebd897a79dd3b3541ae6cdc142572c5"

RPROVIDES:${PN} += "libyui-qt-rest-api \
libyui-qt-rest-api.so.16 \
libyui-qt-rest-api16"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui-qt16 \
libyui-rest-api16 \
libyui.so.16 \
libyui16 \
yui-backend"

inherit rpm
