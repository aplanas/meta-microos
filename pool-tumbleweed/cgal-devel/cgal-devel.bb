SUMMARY = "Development files and tools for CGAL applications"
DESCRIPTION = "This package provides the headers files and tools you may need to \
develop applications using CGAL."
LICENSE = "BSL-1.0 & GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "5.6"

RPM_NAME = "cgal-devel-5.6-1.1.aarch64.rpm"
RPM_HASH = "d7d362d880f38487ba7da2eeb27324dcaf5d84865e69b116c1668fd00f1e861bb39ef6b1c4699016c3f2b84d96c8750ee2abbae6a53fab94b57fa3e42a9942b6"

RPROVIDES:${PN} += "cgal-devel \
cmake-CGAL \
libcgal-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
blas \
cmake \
gmp-devel \
lapack \
libboost-atomic-devel \
libboost-system-devel \
libboost-thread-devel \
mpfr-devel \
zlib-devel"

inherit rpm
