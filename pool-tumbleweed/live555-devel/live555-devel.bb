SUMMARY = "LIVE555 Streaming Media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.01.19"

RPM_NAME = "live555-devel-2023.01.19-1.4.aarch64.rpm"
RPM_HASH = "5ad01c38513b035365183f72a685b7ab7be7eb2a89c7870447e6b165f75d5fd9764db7a86d8bb49a000d40e4757b4f100c2227b719e56769cf0e0cb5263c4253"

RPROVIDES:${PN} += "live555-devel \
live555-devel(aarch-64) \
pkgconfig(live555)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libBasicUsageEnvironment2 \
libUsageEnvironment3 \
libgroupsock30 \
libliveMedia107 \
pkgconfig \
pkgconfig(openssl)"

inherit rpm
