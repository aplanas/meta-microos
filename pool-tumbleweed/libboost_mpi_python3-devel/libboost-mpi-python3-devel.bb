SUMMARY = "Development library for Boost.MPI Python 3.x serialization"
DESCRIPTION = "This package contains the Boost.MPI development library for Python 3.x \
serialization interface \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_mpi_python3-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "7c5e41d0f0957b19068192a5f14b8d5f47a589aa2ca06dbfe8c3fc01854b6feaf955eb90da43525b6dd47d1fe275fb20a4e10a4a92f23fb22f5b186896d99074"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost_mpi_python3-devel"

RDEPENDS:${PN} += "libboost_mpi_python-py3-1_82_0-devel"

inherit rpm
