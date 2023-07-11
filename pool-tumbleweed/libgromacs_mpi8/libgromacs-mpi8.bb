SUMMARY = "Libraries for Gromacs"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains libraries for Gromacs"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2023"

RPM_NAME = "libgromacs_mpi8-2023-1.2.aarch64.rpm"
RPM_HASH = "9f1cc1a3fc2b4144dbbb01a5dbb551ede3bebe2abbe3282f54ae69d29eb4ab06d11e0252d73bb049b715b3a97aaaa2a3bd8d56db0f4ebe9c2e3206a70c4aa435"

RPROVIDES:${PN} += "libgromacs-mpi.so.8 \
libgromacs-mpi8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libgomp.so.1 \
liblapack.so.3 \
libm.so.6 \
libmpi.so.40 \
libmuparser.so.2.3.4 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
