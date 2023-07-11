SUMMARY = "Efficient evaluation of integrals over ab initio effective core potentials"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libecpint1-1.0.7-2.11.aarch64.rpm"
RPM_HASH = "31c64d989db3d3b690e9683a375cb6e7705fa3bbbe7eaa40377d2369080c44870ac53fc8368c77636f85a26211d4ff9e8bd131a87dd2c18f24a4ec07eba95846"

RPROVIDES:${PN} += "libecpint.so.1 \
libecpint1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerf.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
