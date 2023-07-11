SUMMARY = "Development files for libjrtp"
DESCRIPTION = "JRTPLIB is an object-oriented library written in C++ for making use of \
the Real-time Transport Protocol (RTP) as described in RFC 3550. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libjrtp."
LICENSE = "MIT"

PV = "3.11.1"

RPM_NAME = "jrtplib-devel-3.11.1-1.21.aarch64.rpm"
RPM_HASH = "c84f3a14756d1c16f4856395d254285a07f9c0b8272bf6d7b796aec58cff6ac50b9ced510412b06c46edf623e34315b0a7a8b97ff76f6a54a4b80b6517d0a551"

RPROVIDES:${PN} += "cmake-JRTPLIB \
jrtplib-devel \
pkgconfig-jrtplib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjrtp3-11-1"

inherit rpm
