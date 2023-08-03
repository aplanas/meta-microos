SUMMARY = "Qt 6 Quick3DSpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DSpatialAudio private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.2"

RPM_NAME = "qt6-quick3dspatialaudio-private-devel-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a9b1ef951e0f3e6071df94eabdb66b86083d0d04d5d00212ae80277a2fb8d8141785be33e69f58581064c480e50d5ab07d59966fbff086ab0bb3ad9e366acbed"

RPROVIDES:${PN} += "cmake-Qt6Quick3DSpatialAudioPrivate \
qt6-quick3dspatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6SpatialAudio \
libQt6Quick3DSpatialAudio6 \
qt6-quick3d-private-devel"

inherit rpm
