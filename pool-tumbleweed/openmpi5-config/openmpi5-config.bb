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

RPM_NAME = "openmpi5-config-5.0.0-2.4.aarch64.rpm"
RPM_HASH = "0cabe4232f433d4c2286a1798e167140394252cc82d778562daaed8b351e43c84c8ace473f16efaa5c5385ba7820d603dd9627f8d5d44b64eb58ccff8066f57a"

RPROVIDES:${PN} += "config-openmpi5-config \
openmpi-runtime-config \
openmpi5-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
