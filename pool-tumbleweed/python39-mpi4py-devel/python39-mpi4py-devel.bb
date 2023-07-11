SUMMARY = "Development files for python39-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python39-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python39-mpi4py-devel-3.1.4-2.7.aarch64.rpm"
RPM_HASH = "d82fbb141a554461d5ff87d6dd9455fe009b4abccd4075c2f203086676bbbf223f7546e3ca141e95bf619519071c5da28e9fbc23368c2ff5c50b3adc0a79a43d"

RPROVIDES:${PN} += "python39-mpi4py-devel"

RDEPENDS:${PN} += "python39-devel \
python39-mpi4py \
python39-mpi4py-common-devel"

inherit rpm
