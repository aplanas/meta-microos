SUMMARY = "Non-ABI stable API for the Qt 6 GUI libraries"
DESCRIPTION = "This package provides private headers of libQt6Gui that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-gui-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "fa214d8cb1f766dcc9fe278720c770c25a43d8c974d48319050c52f70a3d3bdf195ab4c5cac9593c6ea35fc957494d67e2a5d10e4aed8163915962e3233e72b7"

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
