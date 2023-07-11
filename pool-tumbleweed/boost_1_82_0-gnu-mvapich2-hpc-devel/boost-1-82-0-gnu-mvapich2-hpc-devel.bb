SUMMARY = "Development package for Boost C++"
DESCRIPTION = "This package contains all that is needed to develop/compile \
applications that use the Boost C++ libraries. For documentation see \
the documentation packages (html, man or pdf)."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mvapich2-hpc-devel-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "5f9162521afad629d96ba5d9856542d95eb98fd3c0a8e256ec36fa44ff6c50c62db9de2da8a9a2b23e1433c9bc06df7240fcde4b916cd922e93b91730516abe6"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-devel"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
