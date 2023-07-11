SUMMARY = "Internet Low Bitrate Codec"
DESCRIPTION = "iLBC (internet Low Bitrate Codec) is a FREE speech codec suitable for \
robust voice communication over IP. The codec is designed for narrow \
band speech and results in a payload bit rate of 13.33 kbit/s with an \
encoding frame length of 30 ms and 15.20 kbps with an encoding length \
of 20 ms. The iLBC codec enables graceful speech quality degradation in \
the case of lost frames, which occurs in connection with lost or \
delayed IP packets."
LICENSE = "GPL-2.0+"

PV = "3951"

RPM_NAME = "libilbc0-3951-122.31.aarch64.rpm"
RPM_HASH = "f1269a772d94902924e3310c1395bbc4e1d3b708ce71a4b569ac5ee3c7194d5852844d109483ebc9e5b7ea58ee220c826d82c97789eaabb63a799fcb5e02e2c8"

RPROVIDES:${PN} += "ilbc \
libilbc.so.0 \
libilbc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
