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

RPM_NAME = "openmpi5-config-5.0.0-3.1.aarch64.rpm"
RPM_HASH = "fae83112f3b101b3b733c108041f7c06e25165836776228c948afef72fad025ce619a1e11e572344621705851f7d9fc3fd2969105b9333da78a8a0ad56193ed5"

RPROVIDES:${PN} += "config-openmpi5-config \
openmpi-runtime-config \
openmpi5-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
