SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mpich-hpc-python3-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "2c6dcde62bd37bcf2d57a755176f60b3122b92a5c014c7c8b32bee944e609df7ad4514b99c6e122e9c9c61df68422976583fc95ff21e88b6875e6170637be780"

RPROVIDES:${PN} += "boost_1_82_0-gnu-mpich-hpc-python3 boost_1_82_0-gnu-mpich-hpc-python3(aarch-64)"
RDEPENDS:${PN} += "boost_1_82_0-gnu-mpich-hpc"

inherit rpm
