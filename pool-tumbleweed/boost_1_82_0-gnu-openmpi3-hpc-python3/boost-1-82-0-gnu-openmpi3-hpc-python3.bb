SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi3-hpc-python3-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "5af985f11ddf0c71fee3494baf1851160041925b519e7420011aa01fdadbf7eb9f33c53a4cd98518199c8fd24071f195f0eebc750eb8fe2b0efafa0b8b19051a"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi3-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi3-hpc"

inherit rpm
