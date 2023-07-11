SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-openmpi2-hpc-python3-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "d25b555601123026109aee2da1bebd3e6d9bf7e45991166a061718a950f5e1ffbd8d6dd159aee6992579e9f18ed47ea1a37e7d4034462ea8132ca67a40be80dc"

RPROVIDES:${PN} += "boost-1-82-0-gnu-openmpi2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-openmpi2-hpc"

inherit rpm
