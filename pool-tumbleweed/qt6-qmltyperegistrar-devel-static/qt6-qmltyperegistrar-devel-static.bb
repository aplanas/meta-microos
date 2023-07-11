SUMMARY = "Qt6 QmlTypeRegistrar static library"
DESCRIPTION = "The Qt6 QmlTypeRegistrar static library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-qmltyperegistrar-devel-static-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "9c3f90b1611bdeea4733b8b6dfc2d31d65a21e95cc2a3d2371fcd92fb555c17eef4eecd6f454cd02044038f89872180c35ff7fcbd8acd176d0e50f865921b8f2"

RPROVIDES:${PN} += "cmake-Qt6QmlTypeRegistrarPrivate \
qt6-qmltyperegistrar-devel-static"

RDEPENDS:${PN} += ""

inherit rpm
