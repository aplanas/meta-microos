SUMMARY = "Development files for python310-mpi4py"
DESCRIPTION = "Development libraries and headers needed to build packages using python310-mpi4py."
LICENSE = "BSD-2-Clause"

PV = "3.1.4"

RPM_NAME = "python310-mpi4py-devel-3.1.4-2.7.aarch64.rpm"
RPM_HASH = "a721f9cfbee822298e5ff339b98952c402283705da9bd38c8cc536d0fa56a44fff230dba488cf90db684e41321f7346c1adfd697569839ac990b1d33c2d17f94"

RPROVIDES:${PN} += "python310-mpi4py-devel"

RDEPENDS:${PN} += "python310-devel \
python310-mpi4py \
python310-mpi4py-common-devel"

inherit rpm
