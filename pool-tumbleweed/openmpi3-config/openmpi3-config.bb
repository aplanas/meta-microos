SUMMARY = "Runtime configuration files for openMPI  version 3.1.6"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "3.1.6"

RPM_NAME = "openmpi3-config-3.1.6-7.4.aarch64.rpm"
RPM_HASH = "4abfba4eb8e2d229972164aa0086716d75c65aefa8137caca53837a2671d50efb32793bbb9ebd18461eda02b8f3e6fcb39f72aa7c1b73d56646dc05b1ef192ed"

RPROVIDES:${PN} += "config-openmpi3-config \
openmpi-runtime-config \
openmpi3-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
