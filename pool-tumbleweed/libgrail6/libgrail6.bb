SUMMARY = "Gesture recognition library"
DESCRIPTION = "This tree consists of an interface and tools for handling gesture \
recognition and gesture instantiation. \
 \
The library handles tentative getures, i.e., buffering of events \
for several alternative gestures until a match is confirmed."
LICENSE = "LGPL-3.0 & GPL-3.0"

PV = "3.1.1"

RPM_NAME = "libgrail6-3.1.1-1.23.aarch64.rpm"
RPM_HASH = "501f4f577d1f09e2f41a478e5a70e18b962cda9c6295da4fd6c54301b12ca2eaf00804899965a9296a3336010df0c071cf9f3991f800eb3f739adc42a198c6ca"

RPROVIDES:${PN} += "libgrail.so.6 \
libgrail6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libframe.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
