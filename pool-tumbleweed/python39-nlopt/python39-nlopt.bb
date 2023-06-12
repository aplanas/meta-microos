SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.0-only"

PV = "2.7.1"

RPM_NAME = "python39-nlopt-2.7.1-3.14.aarch64.rpm"
RPM_HASH = "048e6c43f54cc55332cb68ac0b527bbd6cf6a06718ff5882b42d1bcd7b2de7ecced4741967490569df3fd7ea0d9605e44951d1647fd0af71ce3bc83b9a662b8d"

RPROVIDES:${PN} += "python39-nlopt \
python39-nlopt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libnlopt.so.0()(64bit) \
libpython3.9.so.1.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
python(abi) \
python39-numpy"

inherit rpm
