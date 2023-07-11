SUMMARY = "LeechCraft Music Streamer Module"
DESCRIPTION = "This package provides a streamer plugin for LeechCraft player \
to stream music from LMP via HTTP."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.14794.g33744ae6ce"

RPM_NAME = "leechcraft-lmp-httstream-0.6.70+git.14794.g33744ae6ce-3.2.aarch64.rpm"
RPM_HASH = "79363cc4ba13ef1b81ac33d0bbf7ef5dca8b85f30668d0b1a7c6792a1f0576a330b4bdb7871300fd8ed5e6d3f617eaf3e34fbe27bfbad8387037f1631760c34f"

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
