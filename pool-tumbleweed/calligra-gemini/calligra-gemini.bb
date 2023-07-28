SUMMARY = "Touched-based optimized Calligra Suite"
DESCRIPTION = "Touched based optimized Calligra Suite"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-gemini-3.2.1-7.20.aarch64.rpm"
RPM_HASH = "a79a2c91a90d6d5c01fb1c2c290fd68d0e6cf558d111d0f06150eb5e5881359b801d04864eaebe62fefcb09e6137f30b671ca380abe2bfc400312a72239b0e72"

RPROVIDES:${PN} += "calligra-gemini \
libcalligrageminidropboxplugin.so \
libcalligrageminigitplugin.so \
libgemini.so.17 \
qt5qmlimport-Calligra.Gemini.Dropbox.1 \
qt5qmlimport-Calligra.Gemini.Git.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami2 \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5CoreAddons.so.5 \
libKF5Crash.so.5 \
libKF5I18n.so.5 \
libKF5IconThemes.so.5 \
libKF5WidgetsAddons.so.5 \
libKF5XmlGui.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libcalligrastageprivate.so.17 \
libflake.so.17 \
libgit2.so.1.6 \
libkomain.so.17 \
libkoodf.so.17 \
libkostore.so.17 \
libkotext.so.17 \
libkowidgets.so.17 \
libkowidgetutils.so.17 \
libpigmentcms.so.17 \
libqt5-qtquickcontrols \
libstdc++.so.6 \
libwordsprivate.so.17 \
qt5qmlimport-Calligra.Gemini.Dropbox.1 \
qt5qmlimport-Calligra.Gemini.Git.1 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-QtQuick.Controls.1 \
qt5qmlimport-QtQuick.Controls.2 \
qt5qmlimport-QtQuick.Layouts.1 \
qt5qmlimport-QtWebEngine.1 \
qt5qmlimport-org.kde.calligra.1 \
qt5qmlimport-org.kde.kirigami.2 \
qt5qmlimport-org.krita.sketch.1"

inherit rpm
