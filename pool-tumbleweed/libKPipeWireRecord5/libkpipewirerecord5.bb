SUMMARY = "PipeWire integration for KDE Plasma - recording support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the library needed for video and audio capture."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "libKPipeWireRecord5-5.27.6-1.1.aarch64.rpm"
RPM_HASH = "e5f0d45dfed3dc994df7281730fa98a2eba539bb0a999c02a195df308a9aa0d7653978153462850475fe49a2b2f6224b131ef9e25f06c1789ad023ede18b14c2"

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
