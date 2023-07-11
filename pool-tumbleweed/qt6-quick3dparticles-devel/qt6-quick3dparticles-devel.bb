SUMMARY = "Qt6 Quick3DParticles library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DParticles library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dparticles-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "f117ac45e13a0ed5e658bf9ea37ce58d0e3affa5d3c37b1ad98c4ae03ef0986cc858cea7b492aa832332a246af83482e1a410364370412b7cb999575a0c135ba"

RPROVIDES:${PN} += "cmake-Qt6Quick3DParticles \
pkgconfig-Qt6Quick3DParticles \
qt6-quick3dparticles-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Quick3DAssetImport \
cmake-Qt6Quick3DRuntimeRender \
libQt6Quick3DParticles6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Gui \
pkgconfig-Qt6Qml \
pkgconfig-Qt6Quick \
pkgconfig-Qt6Quick3D \
pkgconfig-Qt6Quick3DAssetImport \
pkgconfig-Qt6Quick3DRuntimeRender"

inherit rpm
