SUMMARY = "LIVE555 Streaming Media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.01.19"

RPM_NAME = "live555-2023.01.19-1.4.aarch64.rpm"
RPM_HASH = "427a9ae916c41a22da7096e0b08598b32c1811ecfcf145b89c074defdb5028515214b7d195510cddc1bb05c805871fe7ab81898eef1f2aa13ac5fc81608771bb"

RPROVIDES:${PN} += "live555 \
live555(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libBasicUsageEnvironment.so.2()(64bit) \
libUsageEnvironment.so.3()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgroupsock.so.30()(64bit) \
libliveMedia.so.107()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
