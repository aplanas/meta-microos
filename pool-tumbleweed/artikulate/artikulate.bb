SUMMARY = "Pronunciation Self-Teaching"
DESCRIPTION = "Improve your pronunciation by listening to native speakers."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.1"

RPM_NAME = "artikulate-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "3a01266c25d73bd48f150bd5eff832e2c942cc4decf7cb8bcc7ac3b7ee13bf728c3619aeda47453aff5bd621ccaa6c1238154b58ac320b50d32a7151d9f2fa5e"

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
