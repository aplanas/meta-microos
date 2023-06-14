SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DParticles library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DParticles that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticles-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c263e3c798ed0f350a351a16e18ce20f67d08f1062bfeb5e2a38b25dacc432b1a1d159df2fcabe9b12a2630612f2b2a6fab55d9ce8538dcfcedce5b3d9d2053d"

RPROVIDES:${PN} += "qt6-quick3dparticles-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DParticles"

inherit rpm
