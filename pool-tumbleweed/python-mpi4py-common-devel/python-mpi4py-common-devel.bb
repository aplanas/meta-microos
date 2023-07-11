SUMMARY = "Shared development files for python-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python-mpi4py \
for both python2 and python3. \
 \
You normally do not need to install this directly, it will be pulled in by \
the python-specific devel package."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python-mpi4py-common-devel-3.1.4-2.7.aarch64.rpm"
RPM_HASH = "0241ceafc525b6bcbd313c268f7a7fec58be8f38579694ced205390bd1a9e8404c619799815bb15dc381b8489996891eed6857aa6b65a1c55a8a0727d5590fee"

RPROVIDES:${PN} += "python-mpi4py-common-devel \
python310-mpi4py-common-devel \
python311-mpi4py-common-devel \
python39-mpi4py-common-devel"

RDEPENDS:${PN} += "openmpi4-devel"

inherit rpm
