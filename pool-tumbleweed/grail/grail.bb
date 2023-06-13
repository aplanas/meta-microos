SUMMARY = "Gesture recognition library"
DESCRIPTION = "This tree consists of an interface and tools for handling gesture \
recognition and gesture instantiation. \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "grail-3.1.1-1.22.aarch64.rpm"
RPM_HASH = "4b30f7dc42c372770c9cb4f89555b656dc757321647ee8099e292528b3f394fd8fa951f27d68a99a93a57578664b7f13ee26c7c8f52edcb0dd7d95c0fde03782"

RPROVIDES:${PN} += "grail \
grail(aarch-64) \
grail-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXi.so.6()(64bit) \
libc.so.6()(64bit) \
libframe.so.6()(64bit) \
libgrail.so.6()(64bit)"

inherit rpm
