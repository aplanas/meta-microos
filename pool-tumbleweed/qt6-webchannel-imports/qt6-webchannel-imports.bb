SUMMARY = "Qt 6 WebChannel QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 WebChannel module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-webchannel-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "137f261655080d8162096e809b1861fae42223aeb54bede04a4197b86a32957d49b6a66a8664ce7b4ed352a84ba12a451938b824a9379f39841de7ae86deb57e"

RPROVIDES:${PN} += "libwebchannelplugin.so \
qt6-webchannel-imports \
qt6qmlimport-QtWebChannel.1"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6WebChannel.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
