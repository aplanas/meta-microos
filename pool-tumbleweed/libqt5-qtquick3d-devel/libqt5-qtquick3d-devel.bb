SUMMARY = "Qt Development Kit"
DESCRIPTION = "You need this package if you want to compile programs with Qt Quick 3D."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.10+kde1"

RPM_NAME = "libqt5-qtquick3d-devel-5.15.10+kde1-1.1.aarch64.rpm"
RPM_HASH = "d7d6049df3bb8ab9a65340fde168b9220cd43ed7acd6f3780c4315ef1dcd0f520a401aaa6cf31adca7fcc455eb1664047f7435a0efe6e14ebaef3dd2a8b874a2"

RPROVIDES:${PN} += "cmake-Qt5Quick3D \
cmake-Qt5Quick3DAssetImport \
cmake-Qt5Quick3DRender \
cmake-Qt5Quick3DRuntimeRender \
cmake-Qt5Quick3DUtils \
libqt5-qtquick3d-devel \
pkgconfig-Qt5Quick3D \
pkgconfig-Qt5Quick3DAssetImport \
pkgconfig-Qt5Quick3DRender \
pkgconfig-Qt5Quick3DRuntimeRender \
pkgconfig-Qt5Quick3DUtils"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Quick3D5 \
libQt5Quick3DAssetImport5 \
libqt5-qtquick3d-tools \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick \
pkgconfig-Qt5Quick3DAssetImport \
pkgconfig-Qt5Quick3DRender \
pkgconfig-Qt5Quick3DRuntimeRender \
pkgconfig-Qt5Quick3DUtils"

inherit rpm
