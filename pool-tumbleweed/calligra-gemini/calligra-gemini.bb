SUMMARY = "Touched-based optimized Calligra Suite"
DESCRIPTION = "Touched based optimized Calligra Suite"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-gemini-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "2ac92d4d1153f8a79d030c9dd6e17aea860bea391dfea0cbab5eeffb931ab73a804d4d210185ffa856c95ad26a7633a36de431f68874be5e08f89e101cfa346d"

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
libgit2.so.1.7 \
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
