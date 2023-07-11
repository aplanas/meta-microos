SUMMARY = "Basic Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.05.10"

RPM_NAME = "libliveMedia107-2023.05.10-1.1.aarch64.rpm"
RPM_HASH = "86faa88a233770ed969b5af31dda4122e30f6b99b1339d51bdedbc7be3ccdf62e3c47f85132564c974de54368175af0a4232fafb2e9c163610b13482849b978d"

RPROVIDES:${PN} += "libliveMedia.so.107 \
libliveMedia107"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3"

inherit rpm
