SUMMARY = "PipeWire integration for KDE Plasma - recording support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the library needed for video and audio capture."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.5"

RPM_NAME = "libKPipeWireRecord5-5.27.5-1.1.aarch64.rpm"
RPM_HASH = "6565b1e3ed0827541d79ffc5582bf317904e9f8346fee220768115091594dd7a2e47eba3638c413008b0f4fc1a758887b6fd1fa887fb7e77ef21fe490d4a4b9e"

RPROVIDES:${PN} += "libKPipeWireRecord.so.5 \
libKPipeWireRecord5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKPipeWire.so.5 \
libKPipeWireDmaBuf.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libstdc++.so.6 \
libswscale.so.7"

inherit rpm
