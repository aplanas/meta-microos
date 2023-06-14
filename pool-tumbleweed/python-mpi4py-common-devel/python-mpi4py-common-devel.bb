SUMMARY = "Shared development files for python-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python-mpi4py \
for both python2 and python3. \
 \
You normally do not need to install this directly, it will be pulled in by \
the python-specific devel package."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python-mpi4py-common-devel-3.1.4-2.5.aarch64.rpm"
RPM_HASH = "b71db21501122c5cc0e7a87fb89d7478e8cd26463d4dbb087552c9e8c1534741024951d02c7d79c7df51bc35168aaa656f3d16d44f05767aa3f4b1171c8219b6"

RPROVIDES:${PN} += "python-mpi4py-common-devel \
python310-mpi4py-common-devel \
python311-mpi4py-common-devel \
python39-mpi4py-common-devel"

RDEPENDS:${PN} += "openmpi4-devel"

inherit rpm
