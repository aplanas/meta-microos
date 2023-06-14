SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi3-hpc-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "5e620de20f5925da7663d20b69d9904f9daff3471d82f984e9a07eb61bdd0277204ce042be4dba4afbcf81fbba72fae816597527406191f82c81144488eb569d"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi3-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi3-hpc \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
