SUMMARY = "QtQuick bindings for configuration entities"
DESCRIPTION = "KConfigQml provides QtQuick bindings to KConfig, which allows using the library with \
QML."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5ConfigQml5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "2ae09a2cc6dadb40c8b1cedcb8abf980364d51bdb85a2505b41be08861e0a6b378e31172bbcb9181426e0368741154d53130ad03533a65d8870d6edb938fe4c5"

RPROVIDES:${PN} += "libKF5ConfigQml.so.5 \
libKF5ConfigQml5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui5 \
libQt5Qml.so.5 \
libQt5Xml5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
