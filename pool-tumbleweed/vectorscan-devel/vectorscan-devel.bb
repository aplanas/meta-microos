SUMMARY = "Libraries and header files for the vectorscan library"
DESCRIPTION = "A fork of Intel's Hyperscan, modified to run on more platforms. \
 \
This package provides the libraries, include files and other resources \
needed for developing Hyperscan applications."
LICENSE = "BSD-3-Clause"

PV = "5.4.9"

RPM_NAME = "vectorscan-devel-5.4.9-2.1.aarch64.rpm"
RPM_HASH = "95c2e5db7927be67b4a52afa5d9fa32bb56460e6aa528724fe5341a984d73951767afe82080fa641a83d2e61e592b4c1c50014a52dd5f573d408b66e6919448b"

RPROVIDES:${PN} += "pkgconfig-libhs \
vectorscan-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhs5-vectorscan5"

inherit rpm
