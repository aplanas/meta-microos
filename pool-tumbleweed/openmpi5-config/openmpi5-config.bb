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

RPM_NAME = "openmpi5-config-5.0.0-4.1.aarch64.rpm"
RPM_HASH = "f0dca9db5e6b3c51d7285bacde46a7ef86cf12adb64becd80206ce1a07a9a1ebf489ea717b785738ba3c12016b473aa38748bbe15951e77fe3d363171e7bcf60"

RPROVIDES:${PN} += "config-openmpi5-config \
openmpi-runtime-config \
openmpi5-config \
pmix-runtime-config"

RDEPENDS:${PN} += ""

inherit rpm
