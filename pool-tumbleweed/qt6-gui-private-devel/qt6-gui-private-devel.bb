SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-gui-private-devel-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "7b7d45b5d5060e4dfd56cc31c56b79006aa6fe1fe1aed6fbfeddb13559266201bdda61b4f94a05f633d3058ad79f97c28818f21650bb8c8e8d46d0da4a158b5b"

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
