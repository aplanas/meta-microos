SUMMARY = "Development files for libre"
DESCRIPTION = "Libre is a portable and generic library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libre."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "re-devel-2.10.0-1.5.aarch64.rpm"
RPM_HASH = "0a95eab9153e172fffbda745e6c7c47ffc83133f86c246e6dc57f3afbdceafdac518c662f0cd8cbad85b8c48cbbdce1d4a6745f40338588c74cf92bc535b6a07"

RPROVIDES:${PN} += "cmake-re \
pkgconfig-libre \
re-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre12"

inherit rpm
