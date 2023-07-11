SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6SpatialAudio6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "4a27994946636386f0f41b6ccd1dfc097502ed5f3f7df893c94b4413b2b0e6422e36e2f8a567c27dcac6bf0a138f57488fa0644c28c9218546efb77cc536708b"

RPROVIDES:${PN} += "libQt6SpatialAudio.so.6 \
libQt6SpatialAudio6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
