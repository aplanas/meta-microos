SUMMARY = "Multi-machine network music performance over the Internet"
DESCRIPTION = "JackTrip is a system used for multi-machine network performance over the \
Internet. It supports any number of channels (as many as the \
computer/network can handle) of bidirectional, high quality, uncompressed \
audio signal streaming."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "jacktrip-1.10.0-1.1.aarch64.rpm"
RPM_HASH = "40b9fded0122e1a4c83fd9aecd6d22080316a2d028859f6d9dea4f4357bba93a9e7dbce25b83af1ba98ce19acf5ed8069add8e653c9a52d6d251f8b5b0c05b7e"

RPROVIDES:${PN} += "jacktrip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
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
