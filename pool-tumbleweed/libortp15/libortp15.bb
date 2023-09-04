SUMMARY = "Real-time Transport Protocol Stack"
DESCRIPTION = "oRTP is a C library implementing the RTP protocol (RFC 1889)."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.98"

RPM_NAME = "libortp15-5.2.98-1.1.aarch64.rpm"
RPM_HASH = "8946f3b5c2addc7569bb05a4501818c15f7175e99f727665469a0f24b0b2ab185f00ff306a3196694ebc0b9b1a9b2a3eace28d41aaeadf9b6a491b1af58a532e"

RPROVIDES:${PN} += "libortp.so.15 \
libortp15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbctoolbox.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
