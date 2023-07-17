SUMMARY = "Non-ABI stable API for the Qt 6 Quick3DParticles library"
DESCRIPTION = "This package provides private headers of libQt6Quick3DParticles that do not \
have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticles-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "c5c9a4f6111715aca7c81f673298a6a61d48011d6ae2d81c9bccff599c5c565abe5e549810dc90cfe00e146d7cf379ccdc139d031656ab243479439860512e6b"

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
