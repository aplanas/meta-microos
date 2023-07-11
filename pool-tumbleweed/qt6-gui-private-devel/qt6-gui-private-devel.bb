SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-gui-private-devel-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "2699c79de95b3197215954e46b1ed535e4ce930c74790615ee525ddf709a442a8377281fa5fe1dbf1345b8f436353b54946109118fc6846d6d0b2f11623dc468"

RPROVIDES:${PN} += "cmake-Qt6EglFSDeviceIntegrationPrivate \
cmake-Qt6EglFsKmsGbmSupportPrivate \
cmake-Qt6EglFsKmsSupportPrivate \
cmake-Qt6XcbQpaPrivate \
qt6-gui-private-devel"

RDEPENDS:${PN} += "cmake-Qt6DeviceDiscoverySupportPrivate \
cmake-Qt6FbSupportPrivate \
cmake-Qt6InputSupportPrivate \
libQt6Gui6 \
pkgconfig-xkbcommon \
qt6-core-private-devel \
qt6-kmssupport-private-devel \
qt6-opengl-private-devel"

inherit rpm
