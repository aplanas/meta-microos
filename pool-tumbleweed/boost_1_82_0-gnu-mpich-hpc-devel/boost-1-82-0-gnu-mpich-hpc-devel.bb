SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mpich-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "424f543e430ac43c4675313f8844df667f79d8b8a2de70c253b487fba7b6e2e60b1f50fdfca0b4e31b9d17dd7538e1e6572a65b11261e5481295fb345e6dd792"

RPROVIDES:${PN} += "boost_1_82_0-gnu-mpich-hpc-devel \
boost_1_82_0-gnu-mpich-hpc-devel(aarch-64)"

RDEPENDS:${PN} += "boost_1_82_0-gnu-mpich-hpc \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
