SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi3-hpc-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "eb518e7e856a4b3dd2ff45bcfe9dcb8baf81bbebbf64fd90f62de57ffb9b03ffcb8615c6045896d6e2f8de49730f7c8d27fb6b372ffef53ab81bf5b429ec6522"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi3-hpc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
