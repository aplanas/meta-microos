SUMMARY = "Boost.MPI Python 3.x serialization library"
DESCRIPTION = "This package contains the Boost.MPI Python 3.x serialization \
inteface."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "boost_1_82_0-gnu-mvapich2-hpc-python3-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "6b17dd8bdf0228e19ff62ef0106bfc974a3bddef6af208d6c1f908d9bb4458c3b887b5517499242b724433059e57da70cf84a17ee0d257a95f45ea65ad004724"

RPROVIDES:${PN} += "boost-1-82-0-gnu-mvapich2-hpc-python3"

RDEPENDS:${PN} += "boost-1-82-0-gnu-mvapich2-hpc"

inherit rpm
