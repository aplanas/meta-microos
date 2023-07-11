SUMMARY = "Qt 6 QuickParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 QuickParticles library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-quickparticles-private-devel-6.5.1-1.3.aarch64.rpm"
RPM_HASH = "9ce869d4cd77c14ef6897977af7e03eb73fa4fca02377c4e2a1f886b4cd2c28f98e6c68b6aba79bd52b5f3d7491ab80f7d36a5845398495261d442549ebb482d"

RPROVIDES:${PN} += "cmake-Qt6QuickParticlesPrivate \
qt6-quickparticles-devel \
qt6-quickparticles-private-devel"

RDEPENDS:${PN} += "libQt6QuickParticles6 \
qt6-gui-private-devel \
qt6-qml-private-devel \
qt6-quick-private-devel"

inherit rpm
