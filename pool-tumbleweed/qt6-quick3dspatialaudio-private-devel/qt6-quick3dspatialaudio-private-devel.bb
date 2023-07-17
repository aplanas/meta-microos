SUMMARY = "Qt 6 Quick3DSpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DSpatialAudio private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dspatialaudio-private-devel-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1405c1819ad831ce308a1b600bf6cc85460656263dcef1321879ba120d9444a0fa35eac053841286647867c74bfacf2fc7fb321ee0fa5c43eff11ffc669af82e"

RPROVIDES:${PN} += "cmake-Qt6Quick3DSpatialAudioPrivate \
qt6-quick3dspatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick3D \
cmake-Qt6SpatialAudio \
libQt6Quick3DSpatialAudio6 \
qt6-quick3d-private-devel"

inherit rpm
