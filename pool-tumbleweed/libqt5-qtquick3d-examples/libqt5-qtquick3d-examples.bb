SUMMARY = "Qt5 Quick 3D examples"
DESCRIPTION = "Examples for the Qt Quick 3D module."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde1"

RPM_NAME = "libqt5-qtquick3d-examples-5.15.9+kde1-1.1.aarch64.rpm"
RPM_HASH = "b3ae4b19b2b24d01794fbbe52bf72ad7b5b731b334819fd86867cf8538b75ce99e074cd7caf3596b60056fd13334527c7038028afe638462f1f1fedfe4217925"

RPROVIDES:${PN} += "libqt5-qtquick3d-examples \
libqt5-qtquick3d-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick3D.so.5()(64bit) \
libQt5Quick3D.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
qt5qmlimport(QtQuick.2) \
qt5qmlimport(QtQuick.Controls.2) \
qt5qmlimport(QtQuick.Layouts.1) \
qt5qmlimport(QtQuick.Window.2) \
qt5qmlimport(QtQuick3D.1) \
qt5qmlimport(QtQuick3D.Effects.1) \
qt5qmlimport(QtQuick3D.Helpers.1) \
qt5qmlimport(QtQuick3D.Materials.1)"

inherit rpm
