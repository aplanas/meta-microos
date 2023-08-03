SUMMARY = "Non-ABI stable API for the Qt 6 3DQuick library"
DESCRIPTION = "This package provides private headers of libQt63DQuick that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3dquick-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "23f31be95d49c823024f65fce4abdf9f53a9188279029c4326e24ba447f2e74ea2489e8a8ba4d51f1387702709d6840594fc9ff4b4db13de226bc5069c4f7ef2"

RPROVIDES:${PN} += "qt6-3dquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DQuick \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
