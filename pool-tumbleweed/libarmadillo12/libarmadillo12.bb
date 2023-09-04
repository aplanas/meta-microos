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

PV = "12.6.1"

RPM_NAME = "libarmadillo12-12.6.1-1.1.aarch64.rpm"
RPM_HASH = "9b5f4bd16e3ef82dfbf00bb380cded8b535a0e7819261d057fb64d2829eba79c9c4d41970f606caa43c4ad56de6ccafb49ca56418c24c9003eb2c59d0262a4a2"

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
