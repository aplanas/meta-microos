SUMMARY = "Development files for Lattice Basis Reduction with libfplll"
DESCRIPTION = "fplll contains several algorithms on lattices that rely on \
floating-point computations. This includes implementations of the \
floating-point LLL reduction algorithm, offering different \
speed/guarantees ratios. It also includes a rigorous floating-point \
implementation of the Kannan-Fincke-Pohst algorithm that finds a \
shortest non-zero lattice vector. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfplll."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.4"

RPM_NAME = "fplll-devel-5.4.4-1.4.aarch64.rpm"
RPM_HASH = "31cba7606d85f8e96bcfa90fba0589f52a91a2c578560474ab1a9f41876597958126998cc4e9a0ad6bf056f8cf22e5ade6ae8624d080717e327ec21392d2bff1"

RPROVIDES:${PN} += "fplll-devel \
libfplll-devel \
pkgconfig-fplll"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplll8"

inherit rpm
