SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DParticles library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DParticles that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dparticles-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "333b4c7d2a8e65bcd7ac0690bbd930e56069f0b0ac94db58b2968215a6688a5a11fb5269825208a6f6904d10c974aad47ad156643501a38a94f0015658607017"

RPROVIDES:${PN} += "qt6-quick3dparticles-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3DParticles \
qt6-core-private-devel \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel \
qt6-quick3d-private-devel \
qt6-quick3dassetimport-private-devel \
qt6-quick3druntimerender-private-devel"

inherit rpm
