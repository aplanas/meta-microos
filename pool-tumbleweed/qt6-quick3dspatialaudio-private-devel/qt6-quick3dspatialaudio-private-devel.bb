SUMMARY = "Qt 6 Quick3DSpatialAudio library - Development files"
DESCRIPTION = "Development files for the Qt 6 Quick3DSpatialAudio private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quick3dspatialaudio-private-devel-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "825809a375966210aec6cd1904eb199275aebcebc5db6ef53feceefb5bff71836cb1706c2b8a10a03e4a31d76aa4426c265a51ef42dcaf98647c78ccc4e4c886"

RPROVIDES:${PN} += "cmake-Qt6Quick3DSpatialAudioPrivate \
qt6-quick3dspatialaudio-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Quick \
libQt6Quick3DSpatialAudio6 \
qt6-multimedia-private-devel"

inherit rpm
