SUMMARY = "Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.01.19"

RPM_NAME = "libUsageEnvironment3-2023.01.19-1.4.aarch64.rpm"
RPM_HASH = "e59b95828fff59de9c4b20e2364fef4be43d513dc2dc1de6510416e3834d74f6de789ec26221028193a58eee68de9ba9a3e0133a96fc269c3b7ceee3b7521b92"

RPROVIDES:${PN} += "libUsageEnvironment.so.3()(64bit) \
libUsageEnvironment3 \
libUsageEnvironment3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
