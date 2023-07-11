SUMMARY = "LIVE555 Streaming Media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.05.10"

RPM_NAME = "live555-2023.05.10-1.1.aarch64.rpm"
RPM_HASH = "f820f182ac4e5bbb76df7a80d6e453de52aef374930ed224359281dea333aa111b49b84cfd1e987612bb5c4ce87f39328dacdadc515a2e0b438cb2fe19fbca66"

RPROVIDES:${PN} += "live555"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libBasicUsageEnvironment.so.2 \
libUsageEnvironment.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libgroupsock.so.30 \
libliveMedia.so.107 \
libstdc++.so.6"

inherit rpm
