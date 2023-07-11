SUMMARY = "Development files for openvdb"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for openvdb. If you would like to develop programs using openvdb, \
you will need to install openvdb-devel."
LICENSE = "Apache-2.0"

PV = "9.0.0"

RPM_NAME = "openvdb-devel-9.0.0-3.6.aarch64.rpm"
RPM_HASH = "6f81628b3f4d23f6e2a049bed5e47a5d735dbd1f88ad07fea2823ce751c0db2a610464a197f2e50c0d6f24cefdb5406112cf664bda078057a882c71ccb770f5d"

RPROVIDES:${PN} += "openvdb-devel"

RDEPENDS:${PN} += "libopenvdb9-0"

inherit rpm
