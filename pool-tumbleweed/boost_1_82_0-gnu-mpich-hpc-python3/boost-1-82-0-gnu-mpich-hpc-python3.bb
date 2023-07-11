SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mpich-hpc-python3-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "c4baf355492f29450128a48e3e78bab84404b1058315b41c15a514b1f9f04b142803bbb632e574ac96fbdbedc44c8d6ed9577aaa9cea8a715752c322bf71df8a"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mpich-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mpich-hpc"

inherit rpm
