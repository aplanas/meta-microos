SUMMARY = "Qt 6 SpatialAudio library"
DESCRIPTION = "The Qt 6 SpatialAudio library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6SpatialAudio6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "1a921c593a6df9dc486925ad26eaa9b8e5e3b2c342c098040e34b07ca43fe65cbbb7ca962970912c168d9c53613bbcf868a9aa727e916c6356e02c551d7d879d"

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
