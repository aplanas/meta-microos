SUMMARY = "Runtime configuration files for openMPI  version 2.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 1 or 2)."
LICENSE = "BSD-3-Clause"

PV = "2.1.6"

RPM_NAME = "openmpi2-config-2.1.6-14.4.aarch64.rpm"
RPM_HASH = "2b3b54444c00ea6a3718de7b7198ebaf56dea3dddca3476a0281a9dec750001e423df18e1d4e1dfdc491858ee0ec470f08e8317552cc8b73abdd6db4f5f5f5d2"

RPROVIDES:${PN} += "config-openmpi2-config \
openmpi-runtime-config \
openmpi2-config"

RDEPENDS:${PN} += ""

inherit rpm
