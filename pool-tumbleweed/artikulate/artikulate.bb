SUMMARY = "Pronunciation Self-Teaching"
DESCRIPTION = "Improve your pronunciation by listening to native speakers."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.08.0"

RPM_NAME = "artikulate-23.08.0-1.1.aarch64.rpm"
RPM_HASH = "ebcf3f8f4d4fefea632b5d837ef2f5398faca0619277a638ec1ed9b947d3f38238dedd30f6b0df59a3207e2215aba45aad9bd7bd57d77844631f8ff65a7be4f1"

RPROVIDES:${PN} += "artikulate \
artikulate5 \
libartikulatecore.so.0 \
libartikulatelearnerprofile.so.0 \
libartikulatesound.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami2 \
knewstuff-imports \
kqtquickcharts \
ld-linux-aarch64.so.1 \
libKF5Archive.so.5 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5Sql.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libQt5XmlPatterns.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libqt5-qtquickcontrols \
libstdc++.so.6"

inherit rpm
