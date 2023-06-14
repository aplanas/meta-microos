SUMMARY = "General Gaussian-type orbitals integrals for quantum chemistry"
DESCRIPTION = "libcint is an open source library for analytical Gaussian integrals. \
It provides C/Fortran API to evaluate one-electron / two-electron \
integrals for Cartesian / real-spherical / spinor Gaussian type functions."
LICENSE = "BSD-2-Clause"

PV = "4.4.1"

RPM_NAME = "libcint4-4.4.1-1.9.aarch64.rpm"
RPM_HASH = "b595435dafa37f53123be3eb378cda9ea712ca9fe83f8852f9c92e7153b999bc00676d393330f7efe959d29e4b39265a32c66c2ecd3598973b38dba4350e10fc"

RPROVIDES:${PN} += "libcint.so.4 \
libcint4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
