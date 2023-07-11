SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "87c4c9c498c0f1b413260c7f38763478cb4121380fe060670c9ea2bd64d815f7cfaa0ceca1a04c2b9972eca90fdab2fa4dcce4afb2438afcf4e0c912f293cb3f"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
