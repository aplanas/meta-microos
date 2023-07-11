SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains development libraries for libscotch."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mpich-devel-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "b1efe9b216f903e71f8576a96c64f8f90cb6ca14a6a3f1404741a8d7aae0d74c9ef5fc79c872178dba6ffa3b7438fee9b1825724df29a1c6edbee53d9b01e878"

RPROVIDES:${PN} += "ptscotch-mpich-devel"

RDEPENDS:${PN} += "gcc-fortran \
libptscotch0-mpich \
mpich-devel \
scotch-devel"

inherit rpm
