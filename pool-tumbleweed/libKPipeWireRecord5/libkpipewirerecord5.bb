SUMMARY = "PipeWire integration for KDE Plasma - recording support"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package contains the library needed for video and audio capture."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.7"

RPM_NAME = "libKPipeWireRecord5-5.27.7-1.1.aarch64.rpm"
RPM_HASH = "e58cc9763567030b427ef9a216ab47fccb0ea23001da0765533b840bbc460eef25ea4c7c6a94298cfdde2b536afe6415d5735f0c80b949e3f7fd37fd67e650df"

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
