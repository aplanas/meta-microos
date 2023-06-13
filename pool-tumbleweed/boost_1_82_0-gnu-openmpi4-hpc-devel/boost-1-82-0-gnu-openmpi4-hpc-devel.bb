SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi4-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "359d266c2b99ddfbd409993944ee2b0cf0daad503169f667d7e85dd90c6fb4d99cf98598fbc0dc2a031e970373e0f8204351a6ba116d17ac143a24b48e75f89b"

RPROVIDES:${PN} += "boost_1_82_0-gnu-openmpi4-hpc-devel \
boost_1_82_0-gnu-openmpi4-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "boost_1_82_0-gnu-openmpi4-hpc \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
