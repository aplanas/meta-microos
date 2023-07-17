SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-gui-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "5b4fed96137ddf7b5ca3424476af7e7a6cab43af1530c3e968b10a96d31def9551d534c93ce35aab0afc0125ef335bd2aed33b2285b1e3232e9f40b9d9a5fb4c"

RPROVIDES:${PN} += "cmake-Qt6EglFSDeviceIntegrationPrivate \
cmake-Qt6EglFsKmsGbmSupportPrivate \
cmake-Qt6EglFsKmsSupportPrivate \
cmake-Qt6XcbQpaPrivate \
qt6-gui-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DeviceDiscoverySupportPrivate \
cmake-Qt6FbSupportPrivate \
cmake-Qt6Gui \
cmake-Qt6InputSupportPrivate \
libQt6Gui6 \
pkgconfig-xkbcommon \
qt6-core-private-devel \
qt6-kmssupport-private-devel \
qt6-opengl-private-devel"

inherit rpm
