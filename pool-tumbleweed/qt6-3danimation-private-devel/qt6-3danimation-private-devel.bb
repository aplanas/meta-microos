SUMMARY = "Non-ABI stable API for the Qt 6 3DAnimation library"
DESCRIPTION = "This package provides private headers of libQt63DAnimation that do not have any \
ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-3danimation-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a3466c49a3df6cad710f0796b52228397c083342e2b88e60ecf158d33e44c06d8ed1cd8dc0be1c840463c8df5cc68241e86bc0970c3862a9632e343cc84a978c"

RPROVIDES:${PN} += "qt6-3danimation-private-devel"

RDEPENDS:${PN} += "cmake-Qt63DAnimation \
qt6-3dcore-private-devel \
qt6-3drender-private-devel \
qt6-core-private-devel"

inherit rpm
