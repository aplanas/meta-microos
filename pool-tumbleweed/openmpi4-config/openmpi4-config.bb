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

RPM_NAME = "openmpi4-config-4.1.4-2.3.aarch64.rpm"
RPM_HASH = "56f68e5672431bb9bd3b1ac4fdc4ca0bf80ab4810f1bde61542cb4cd7c59fb6fffbc5824a52a66b18b6e0742df4d5dea5c3c8936fdd3bd4f542603dd211b6cd1"

RPROVIDES:${PN} += "config(openmpi4-config) \
openmpi-runtime-config \
openmpi4-config \
openmpi4-config(aarch-64) \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
