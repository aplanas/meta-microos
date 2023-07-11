SUMMARY = "Group sock library of live555 streaming media"
DESCRIPTION = "This code forms a set of C++ libraries for multimedia streaming, \
using open standard protocols (RTP/RTCP, RTSP, SIP). These libraries \
can be used to build streaming applications"
LICENSE = "LGPL-2.1-only"

PV = "2023.05.10"

RPM_NAME = "libgroupsock30-2023.05.10-1.1.aarch64.rpm"
RPM_HASH = "bdc0b6c4e146f4b114f7aaa90d980158ac24852eb0d80a96e2e906138a47570b5dc11d54a5e9625a9b85f63e5e97e47e724eb2f8ee37c739a02ca8c2b1cb0888"

RPROVIDES:${PN} += "libgroupsock.so.30 \
libgroupsock30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
