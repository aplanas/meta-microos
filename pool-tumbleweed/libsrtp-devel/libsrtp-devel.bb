SUMMARY = "Development files for the Secure Real-Time Transport Protocol (SRTP) library"
DESCRIPTION = "libsrtp is an implementation of the Secure Real-time Transport \
Protocol (SRTP) originally authored by Cisco Systems, Inc. \
 \
This subpackage contains the development headers."
LICENSE = "BSD-3-Clause"

PV = "1.6.0"

RPM_NAME = "libsrtp-devel-1.6.0-2.23.aarch64.rpm"
RPM_HASH = "0fa7c40bc6de87511a387ea88bde781d3be0bef96a78697d95050bd1f20f358626024dccd0377a9244ca8bd893e486c8c78f2868a8d47860e24ddc88317ad79b"

RPROVIDES:${PN} += "libsrtp-devel \
pkgconfig-libsrtp \
srtp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsrtp1"

inherit rpm
