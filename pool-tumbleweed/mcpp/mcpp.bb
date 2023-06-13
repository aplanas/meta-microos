SUMMARY = "Matsui's C Preprocessor"
DESCRIPTION = "mcpp is a small and portable C/C++ preprocessor implementing all of \
C90, C99 and C++98."
LICENSE = "BSD-3-Clause"

PV = "2.7.2"

RPM_NAME = "mcpp-2.7.2-24.14.aarch64.rpm"
RPM_HASH = "0b1fca1bf83e35f2a0e9a1ea2bce8930d03ae8415ca85bb9efa5e3bf57d55baca9fc9103b3a831c7f2821fa3af6b4a36cebcdc1a762cc72809425bf2b40cd493"

RPROVIDES:${PN} += "mcpp \
mcpp(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libmcpp.so.0()(64bit)"

inherit rpm
