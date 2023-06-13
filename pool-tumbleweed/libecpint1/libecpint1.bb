SUMMARY = "Efficient evaluation of integrals over ab initio effective core potentials"
DESCRIPTION = "Libecpint is a C++ library for the efficient evaluation of integrals over ab \
initio effective core potentials, using a mixture of generated, recursive \
code and Gauss-Chebyshev quadrature. It is designed to be standalone and \
generic."
LICENSE = "MIT"

PV = "1.0.7"

RPM_NAME = "libecpint1-1.0.7-2.10.aarch64.rpm"
RPM_HASH = "51040cf73e1834f795b8af4fec70d8f420dcc0fbfa215fd7d878642ba2ff3e1d32ce53aa74add7f87698a4d40acb455a4c72b0aeb95f0ef116cc75e3f297b739"

RPROVIDES:${PN} += "libecpint.so.1()(64bit) \
libecpint1 \
libecpint1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcerf.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libpugixml.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
