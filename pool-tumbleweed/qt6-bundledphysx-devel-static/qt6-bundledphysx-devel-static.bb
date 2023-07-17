SUMMARY = "Qt6 BundledPhysX static library"
DESCRIPTION = "The Qt6 BundledPhysX static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-bundledphysx-devel-static-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "128a3329b9f7fe664ec3fdf0b5c0d1419f573172bf4e4420d418833ec6b2b3d145786baa8dac8484ad4ee42f82606aed2fb9176f2571339b9500de96e0753e64"

RPROVIDES:${PN} += "cmake-Qt6BundledPhysX \
qt6-bundledphysx-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
