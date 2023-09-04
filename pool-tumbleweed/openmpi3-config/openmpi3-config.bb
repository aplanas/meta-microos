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

RPM_NAME = "openmpi3-config-3.1.6-8.1.aarch64.rpm"
RPM_HASH = "6ab2e0950c0b8f33a7b7359fb9b4fe0cd79888b2380c2b7d35a93ecdf6db21507b82838686b2fff0d7e0133975a085ebc303beaeeec96237abbd77db38c3bbaa"

RPROVIDES:${PN} += "config-openmpi3-config \
openmpi-runtime-config \
openmpi3-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
