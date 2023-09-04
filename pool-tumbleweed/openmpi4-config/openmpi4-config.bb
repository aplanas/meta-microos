SUMMARY = "Runtime configuration files for openMPI  version 4.1.5"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "4.1.5"

RPM_NAME = "openmpi4-config-4.1.5-2.1.aarch64.rpm"
RPM_HASH = "786686cf6e8558d74936923d1bb81daaadad095a5bdac23905fd7f85d63a28f90985dee998acf138699d456f00b65d7dc460521b9ac2487619bf140cf80941ec"

RPROVIDES:${PN} += "config-openmpi4-config \
openmpi-runtime-config \
openmpi4-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
