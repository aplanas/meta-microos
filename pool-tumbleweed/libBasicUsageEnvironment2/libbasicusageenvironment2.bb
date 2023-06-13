SUMMARY = "Basic Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.01.19"

RPM_NAME = "libBasicUsageEnvironment2-2023.01.19-1.4.aarch64.rpm"
RPM_HASH = "2a579a52f68b59f655f3c7e066aa015bd78e6837d3fc56264947ccb3c012c841a900fb827be23b06a5af081c5b6a8f2ef83a29c26faa3ba3596f62c7342a2dcd"

RPROVIDES:${PN} += "libBasicUsageEnvironment.so.2()(64bit) \
libBasicUsageEnvironment2 \
libBasicUsageEnvironment2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
