SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6SpatialAudio6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "c4df8d17c2291102a60f89b08bb3f10bacaae5d0ec3e6c896d8153567ecbc5ef5a3fb24b2d24f2a7c9a782b423a3adfd499781cfc95cb34e6d303ad2800ace31"

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
