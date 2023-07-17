SUMMARY = "Non-ABI stable API for the Qt 6 PrintSupport library"
DESCRIPTION = "This package provides private headers of libQt6PrintSupport that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-printsupport-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "4570de1a2e734f98fe3d26d792e7f88ed891a3ac7b86a42d77fde89276018033f307594cde362bd6d16e63dc8dfad679a306275d3a97c066bf4ac3770ce301bd"

RPROVIDES:${PN} += "qt6-printsupport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6PrintSupport \
cups-devel \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-widgets-private-devel"

inherit rpm
