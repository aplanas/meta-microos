SUMMARY = "Basic Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.05.10"

RPM_NAME = "libBasicUsageEnvironment2-2023.05.10-1.1.aarch64.rpm"
RPM_HASH = "345713c87dcec8b65fa672f34b25596ab94120261118ea710671ccc0dc1e9c498478e772df9e87ae8cfa67cd3e5396bf34690ad4b0ca425a8eae7393ac98ca4a"

RPROVIDES:${PN} += "libBasicUsageEnvironment.so.2 \
libBasicUsageEnvironment2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
