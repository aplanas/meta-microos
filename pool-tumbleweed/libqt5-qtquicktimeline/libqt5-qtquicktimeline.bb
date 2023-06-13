SUMMARY = "Qt 5 Quick Timeline Addon"
DESCRIPTION = "The Qt Quick Timeline module provides QML types to use timelines and keyframes \
to animate Qt Quick user interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtquicktimeline-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "9bb216a1543dd291a8c4fba80f8eec300261977c91679c0d533016c86a8453cbb5d1422b9d7fca58086cdd5d8c3132cd8d55986210400c7c20e8fc9b0730caf1"

RPROVIDES:${PN} += "libqt5-qtquicktimeline \
libqt5-qtquicktimeline(aarch-64) \
libqtquicktimelineplugin.so()(64bit) \
qt5qmlimport(QtQuick.Timeline.1)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
