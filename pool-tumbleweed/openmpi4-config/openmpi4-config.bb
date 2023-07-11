SUMMARY = "Runtime configuration files for openMPI  version 4.1.4"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 3)."
LICENSE = "BSD-3-Clause"

PV = "4.1.4"

RPM_NAME = "openmpi4-config-4.1.4-2.4.aarch64.rpm"
RPM_HASH = "bb396a4b37a337961dd81db9fe055cff066d54cea389ea88fa317902a50e5da8464c4b1a3768a3a4746517cac5da17ed3f91f1ecc4bf83cc94b6eec57a67687a"

RPROVIDES:${PN} += "config-openmpi4-config \
openmpi-runtime-config \
openmpi4-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
