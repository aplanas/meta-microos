SUMMARY = "Qt 6 Quick3DSpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DSpatialAudio private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dspatialaudio-private-devel-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "4e7c9e29df39d4000e684d52ce490ef9aa5af8f1784c90ae12daa977a73797033dc570c7aa35bed97fcd1e25ff198f84c7200280b00b481992ad618c51d77350"

RPROVIDES:${PN} += "cmake-Qt6Quick3DSpatialAudioPrivate \
qt6-quick3dspatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
libQt6Quick3DSpatialAudio6 \
qt6-multimedia-private-devel"

inherit rpm
