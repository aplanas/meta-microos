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

RPM_NAME = "fplll-devel-5.4.4-1.3.aarch64.rpm"
RPM_HASH = "db867dd7980d02b9c63dfdf0a7c8341e80fcd00150e194e01749d00a0d88ca4e44dec543e342827e87a45edd0c4580d79feec56965f8d1d8947be874fc53fa8b"

RPROVIDES:${PN} += "fplll-devel \
libfplll-devel \
pkgconfig-fplll"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfplll8"

inherit rpm
