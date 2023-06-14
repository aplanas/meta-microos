SUMMARY = "Multi-machine network music performance over the Internet"
DESCRIPTION = "JackTrip is a system used for multi-machine network performance over the \
Internet. It supports any number of channels (as many as the \
computer/network can handle) of bidirectional, high quality, uncompressed \
audio signal streaming."
LICENSE = "MIT"

PV = "1.9.0"

RPM_NAME = "jacktrip-1.9.0-1.1.aarch64.rpm"
RPM_HASH = "611a6fe794b098f6554737e85d974670d575e31d4da57d48945a598d798fd5345e9187a95f7aa3adf4566b5461c379b1d97185dd2a1e343532ce171bdd20c623"

RPROVIDES:${PN} += "jacktrip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5NetworkAuth.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5WebSockets.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
librtaudio.so.6 \
libstdc++.so.6"

inherit rpm
