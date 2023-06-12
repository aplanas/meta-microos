SUMMARY = "Touched-based optimized Calligra Suite"
DESCRIPTION = "Touched based optimized Calligra Suite"
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-gemini-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "9d2e45e9209f700c9331ee4c2afb737e7cb8354c971a9f917b55a84d431f3954383aac2b1c53d4c4fcf51f998ff77a15ebbe105a5524cc890757c70ea8de0e7a"

RPROVIDES:${PN} += "application() \
application(org.kde.calligragemini.desktop) \
calligra-gemini \
calligra-gemini(aarch-64) \
libcalligrageminidropboxplugin.so()(64bit) \
libcalligrageminigitplugin.so()(64bit) \
libgemini.so.17()(64bit) \
metainfo() \
metainfo(org.kde.calligragemini.appdata.xml) \
mimehandler(application/msword) \
mimehandler(application/rtf) \
mimehandler(application/vnd.ms-powerpoint) \
mimehandler(application/vnd.ms-works) \
mimehandler(application/vnd.oasis.opendocument.presentation) \
mimehandler(application/vnd.oasis.opendocument.presentation-template) \
mimehandler(application/vnd.oasis.opendocument.text) \
mimehandler(application/vnd.oasis.opendocument.text-master) \
mimehandler(application/vnd.oasis.opendocument.text-template) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.presentation) \
mimehandler(application/vnd.openxmlformats-officedocument.presentationml.template) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.document) \
mimehandler(application/vnd.openxmlformats-officedocument.wordprocessingml.template) \
mimehandler(application/vnd.wordperfect) \
mimehandler(application/x-kpresenter) \
mimehandler(application/x-mswrite) \
qt5qmlimport(Calligra.Gemini.Dropbox.1) \
qt5qmlimport(Calligra.Gemini.Git.1)"
RDEPENDS:${PN} += "/sbin/ldconfig \
kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcalligrastageprivate.so.17()(64bit) \
libflake.so.17()(64bit) \
libgit2.so.1.6()(64bit) \
libkomain.so.17()(64bit) \
libkoodf.so.17()(64bit) \
libkostore.so.17()(64bit) \
libkotext.so.17()(64bit) \
libkowidgets.so.17()(64bit) \
libkowidgetutils.so.17()(64bit) \
libpigmentcms.so.17()(64bit) \
libqt5-qtquickcontrols \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libwordsprivate.so.17()(64bit) \
qt5qmlimport(Calligra.Gemini.Dropbox.1) \
qt5qmlimport(Calligra.Gemini.Git.1) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtWebEngine.1) \
qt5qmlimport(org.kde.calligra.1) \
qt5qmlimport(org.kde.kirigami.2) \
qt5qmlimport(org.krita.sketch.1)"

inherit rpm
