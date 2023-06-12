SUMMARY = "Development files for libre"
DESCRIPTION = "Libre is a portable and generic library for real-time communications \
with async I/O support and a complete SIP stack with support for protocols \
such as SDP, RTP/RTCP, STUN/TURN/ICE, BFCP, HTTP and DNS Client. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libre."
LICENSE = "BSD-3-Clause"

PV = "2.10.0"

RPM_NAME = "re-devel-2.10.0-1.4.aarch64.rpm"
RPM_HASH = "9e8662883cbdbca43f2dddb1408dfb52d8925f51ea662ec27fda3d12e44a922aafbe030b86a76f619c354b7bfa0629793337cd3370e32a211b7a28c22355f779"

RPROVIDES:${PN} += "cmake(re) \
pkgconfig(libre) \
re-devel \
re-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libre12"

inherit rpm
