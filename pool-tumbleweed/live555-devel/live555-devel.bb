SUMMARY = "LIVE555 Streaming Media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.05.10"

RPM_NAME = "live555-devel-2023.05.10-1.1.aarch64.rpm"
RPM_HASH = "e1a9fe574f0042934359456f51fd62291ef3489f89fec5a0b4a3f354f9606bee6086443b90fa173ce1d9ea150fc5d82c9267bcc6aec14ad7eae29b498cc0fc5b"

RPROVIDES:${PN} += "live555-devel \
pkgconfig-live555"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libBasicUsageEnvironment2 \
libUsageEnvironment3 \
libgroupsock30 \
libliveMedia107 \
pkgconfig \
pkgconfig-openssl"

inherit rpm
