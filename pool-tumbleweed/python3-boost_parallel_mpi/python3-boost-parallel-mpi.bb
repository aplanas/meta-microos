SUMMARY = "Python 3.x bindings for Boost.Parallel.MPI library"
DESCRIPTION = "This package contains the Boost.Parallel.MPI bindings for Python 3.x \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "python3-boost_parallel_mpi-1.82.0-1.1.noarch.rpm"
RPM_HASH = "9223317dc9dfdd4f9bb8869519b876fddecb40269c9b3f154bca08f907f64da684cf04292ce01a38b84663c90667098769b785a8845ba6cc55dd6b3ecd39e533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-boost_parallel_mpi"

RDEPENDS:${PN} += "python3-boost_parallel_mpi1_82_0"

inherit rpm
