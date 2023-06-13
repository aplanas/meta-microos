SUMMARY = "Group sock library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.01.19"

RPM_NAME = "libgroupsock30-2023.01.19-1.4.aarch64.rpm"
RPM_HASH = "f9c664443d4433771778bfab2acd1b8a69aa63f886f54c9623e7d36f796a4b31a7389aed91d871fd7056522c3996d7f71d69620949b3707a3e11506e31ae316a"

RPROVIDES:${PN} += "libgroupsock.so.30()(64bit) \
libgroupsock30 \
libgroupsock30(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit)"

inherit rpm
