SUMMARY = "Development files for libre"
DESCRIPTION = "Libre is a portable and generic library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libre."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "re-devel-3.3.0-1.1.aarch64.rpm"
RPM_HASH = "2fba6a4c2e01ab20eebe35faec524fe841878baa48f23d499b1cf1e724d8a587644830387473363a3490bc9abc69435a2c7bb7331bbd669fb65c05a92467b150"

RPROVIDES:${PN} += "cmake-libre \
cmake-re \
pkgconfig-libre \
re-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre16"

inherit rpm
