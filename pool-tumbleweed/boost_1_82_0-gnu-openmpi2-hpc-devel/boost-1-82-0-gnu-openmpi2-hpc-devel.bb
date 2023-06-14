SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "01b97d89f0711d503b2b17c0591ddcf8d8478bdaf59262029aa4412489a98b803eebd5e67a7ac45c3efa6160cba0a7ebc19fe7960fcef4ab3594a51786423b04"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
