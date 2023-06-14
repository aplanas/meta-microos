SUMMARY = "Runtime configuration files for openMPI  version 5.0.0"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "5.0.0"

RPM_NAME = "openmpi5-config-5.0.0-2.3.aarch64.rpm"
RPM_HASH = "1714710e73b6a5fbaa2e7cfd7ae68957763f6d3dcc51062b3f1cabf896559c53dba3486ecb3dcf7809a34c90eea8f631f4bc64986bdef8e9a77ec1473e059ec4"

RPROVIDES:${PN} += "config-openmpi5-config \
openmpi-runtime-config \
openmpi5-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
