SUMMARY = "LeechCraft Music Streamer Module"
DESCRIPTION = "This package provides a streamer plugin for LeechCraft player \
to stream music from LMP via HTTP."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-httstream-0.6.70+git.14794.g33744ae6ce-3.1.aarch64.rpm"
RPM_HASH = "1a0dff5e625bd82ac3d13612c0d237690805fc2e7f768e04d92d4f32e2d855358364bbb54df74ab20173e2c86055572f108abd85bcf7954bec0f4bc432d39bcb"

RPROVIDES:${PN} += "leechcraft-lmp-httstream \
libleechcraft-lmp-httstream.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libleechcraft-util-network-qt5.so.0.6.75.1 \
libleechcraft-util-qt5.so.0.6.75 \
libleechcraft-util-xsd-qt5.so.0.6.75 \
libleechcraft-xsd-qt5.so.0.6.75.2 \
libstdc++.so.6"

inherit rpm
