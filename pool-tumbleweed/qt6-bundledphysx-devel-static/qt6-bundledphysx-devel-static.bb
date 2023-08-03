SUMMARY = "Qt6 BundledPhysX static library"
DESCRIPTION = "The Qt6 BundledPhysX static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-bundledphysx-devel-static-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "f0e3191e25a7be22c532476d9b989cb15395cc6673cab87a5ac8149fe5889965c8ca68c4dc0a15c4992258eefe62b000d9bbfa9b6fca5af786894d287562ced1"

RPROVIDES:${PN} += "cmake-Qt6BundledPhysX \
qt6-bundledphysx-devel-static"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
