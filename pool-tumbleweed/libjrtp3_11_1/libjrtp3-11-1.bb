SUMMARY = "An object-oriented RTP library written in C++"
DESCRIPTION = "JRTPLIB is an object-oriented library written in C++ for making use of \
the Real-time Transport Protocol (RTP) as described in RFC 3550."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "libjrtp3_11_1-3.11.1-1.20.aarch64.rpm"
RPM_HASH = "156be511994b720dec05eb6fd9d0737a5a33d2ed18eebee86e6328628618114ad0e304d600b75cd6c5e0788d057ad1d7bc1ab1d2dc6df471a37b4e666d5df9c6"

RPROVIDES:${PN} += "libjrtp.so.3.11.1()(64bit) \
libjrtp3_11_1 \
libjrtp3_11_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjthread.so.1.3.3()(64bit) \
libsrtp.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
