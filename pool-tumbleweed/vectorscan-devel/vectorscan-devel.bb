SUMMARY = "Libraries and header files for the vectorscan library"
DESCRIPTION = "A fork of Intel's Hyperscan, modified to run on more platforms. \
 \
This package provides the libraries, include files and other resources \
needed for developing Hyperscan applications."
LICENSE = "BSD-3-Clause"

PV = "5.4.9"

RPM_NAME = "vectorscan-devel-5.4.9-2.2.aarch64.rpm"
RPM_HASH = "69bece70991fdb97a95ca977560ca2318465b752ecdf03555e55cb6d093db58322f6dda3eac8f6255c5ae00844456b34558d12734bfc9fe947950cee5b0c0e59"

RPROVIDES:${PN} += "pkgconfig-libhs \
vectorscan-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhs5-vectorscan5"

inherit rpm
