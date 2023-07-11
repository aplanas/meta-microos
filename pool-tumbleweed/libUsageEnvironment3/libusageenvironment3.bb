SUMMARY = "Usage Environment library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.05.10"

RPM_NAME = "libUsageEnvironment3-2023.05.10-1.1.aarch64.rpm"
RPM_HASH = "0b70c4f4f70e39d99b7fe5038cbce1dc98a265c8e41eff548e95f53a503d3f38e0eb6c764e8256395632bf59d9cd98581caabcbad66f48c0d2968a252d3175ff"

RPROVIDES:${PN} += "libUsageEnvironment.so.3 \
libUsageEnvironment3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
