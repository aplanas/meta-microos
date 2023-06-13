SUMMARY = "Gesture recognition library"
DESCRIPTION = "This tree consists of an interface and tools for handling gesture \
recognition and gesture instantiation. \
 \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "libgrail6-3.1.1-1.22.aarch64.rpm"
RPM_HASH = "6392879906b8d26b2a9c19ebdf8805cc59a2a1c30e6f08e1819c3a78445d3b86fd1c867956ac71fd3ae5f9890c39b8a43f02fce0523d802757e6b200d64b0daf"

RPROVIDES:${PN} += "libgrail.so.6()(64bit) \
libgrail6 \
libgrail6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libframe.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
