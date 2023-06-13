SUMMARY = "Qt6 BundledPhysX static library"
DESCRIPTION = "The Qt6 BundledPhysX static library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-bundledphysx-devel-static-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0c27bfe5e6b940e04b698463821a8eeb2c5093096b0673cb55d2eefc4404cd16840ab205c03c062beee21f712e5d0e9204d41e4a74d12a0385739a267841f5e0"

RPROVIDES:${PN} += "cmake(Qt6BundledPhysX) \
qt6-bundledphysx-devel-static \
qt6-bundledphysx-devel-static(aarch-64)"

RDEPENDS:${PN} += "qt6-core-private-devel"

inherit rpm
