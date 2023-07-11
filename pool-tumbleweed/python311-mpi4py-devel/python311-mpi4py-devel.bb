SUMMARY = "Development files for python311-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python311-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python311-mpi4py-devel-3.1.4-2.7.aarch64.rpm"
RPM_HASH = "8292d8eecbbae852ca8a4a1f420bb50620430c6f1ba320da336ce42b1558cbdc4727071d1f7c03c98a4b07e7080546ead43419d4706d83fc063b2e22d25a8dbc"

RPROVIDES:${PN} += "python3-mpi4py-devel \
python311-mpi4py-devel"

RDEPENDS:${PN} += "python311-devel \
python311-mpi4py \
python311-mpi4py-common-devel"

inherit rpm
