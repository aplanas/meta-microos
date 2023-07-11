SUMMARY = "Pronunciation Self-Teaching"
DESCRIPTION = "Improve your pronunciation by listening to native speakers."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.3"

RPM_NAME = "artikulate-23.04.3-1.1.aarch64.rpm"
RPM_HASH = "b8a8201cf7e0cc098ec158e67a578f0148e7e30a1dfd1ab9f98f45d1b4ac466bcd90ecb6400c70d29c33a2acbf39a39b437945b6cbe4576cc1ba35bbf829c141"

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
