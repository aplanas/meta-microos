SUMMARY = "C++ matrix library with interfaces to LAPACK and ATLAS"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
Various matrix decompositions are provided through optional \
integration with LAPACK and ATLAS libraries. \
A delayed evaluation approach is employed (during compile time) \
to combine several operations into one and reduce (or eliminate) \
the need for temporaries. This is accomplished through recursive \
templates and template meta-programming. \
 \
This package provides the shared libraries for armadillo."
LICENSE = "Apache-2.0"

PV = "12.6.0"

RPM_NAME = "libarmadillo12-12.6.0-1.1.aarch64.rpm"
RPM_HASH = "9c5467e2aec6941f6c2b7acb32bf0837ec5936daa1b67e71ee9788c57489ac9832183ae7e098bbb64c59c1394b578e79a2e8824feec8ee53ee70b4c5c833c961"

RPROVIDES:${PN} += "libarmadillo.so.12 \
libarmadillo12"

RDEPENDS:${PN} += "/sbin/ldconfig \
libarpack.so.2 \
libblas.so.3 \
libc.so.6 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6 \
libsuperlu.so.6"

inherit rpm
