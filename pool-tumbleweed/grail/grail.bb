SUMMARY = "Gesture recognition library"
DESCRIPTION = "This tree consists of an interface and tools for handling gesture \
recognition and gesture instantiation. \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "grail-3.1.1-1.23.aarch64.rpm"
RPM_HASH = "e685e9897f359653efb788d97b4d74ee80277c5af4c7fd09a6f56840d80734c5eea47ae34c33c3d0905a43760bb92a99777b798b88a402430523de07048f3d40"

RPROVIDES:${PN} += "grail \
grail-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libc.so.6 \
libframe.so.6 \
libgrail.so.6"

inherit rpm
