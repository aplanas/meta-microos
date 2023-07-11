SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mpich-hpc-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "31c6d4bdd7fd3a2dd2b69d38a16c2f8320d36f9a58c923cb9e2e9c38c031e65fe8faf242f3084c63f8675d27a176b84e562e5388ecbea455fd646c382a3908af"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mpich-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
