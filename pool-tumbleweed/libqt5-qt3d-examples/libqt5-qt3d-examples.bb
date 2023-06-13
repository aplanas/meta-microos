SUMMARY = "Qt5 3D examples"
DESCRIPTION = "Examples for the libqt5-qt3d module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qt3d-examples-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "147b6f9f5a5bfc2a4ac8a4b5eb49fc1f9d4440d325d8100acb2618df2fb1b8e951cb8c2207350cd095d014f8a9b8b52d057032c08f7dae4327ce13bc36715609"

RPROVIDES:${PN} += "libqt5-qt3d-examples \
libqt5-qt3d-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DExtras.so.5()(64bit) \
libQt53DExtras.so.5(Qt_5)(64bit) \
libQt53DQuick.so.5()(64bit) \
libQt53DQuick.so.5(Qt_5)(64bit) \
libQt53DQuickExtras.so.5()(64bit) \
libQt53DQuickExtras.so.5(Qt_5)(64bit) \
libQt53DRender.so.5()(64bit) \
libQt53DRender.so.5(Qt_5)(64bit) \
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
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
qt5qmlimport(Qt3D.Core.2) \
qt5qmlimport(Qt3D.Extras.2) \
qt5qmlimport(Qt3D.Input.2) \
qt5qmlimport(Qt3D.Logic.2) \
qt5qmlimport(Qt3D.Render.2) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.1) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Controls.Styles.1) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Scene2D.2) \
qt5qmlimport(QtQuick.Scene3D.2) \
qt5qmlimport(QtQuick.Window.2)"

inherit rpm
