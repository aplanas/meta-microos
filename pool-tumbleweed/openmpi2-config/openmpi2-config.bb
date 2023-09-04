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

RPM_NAME = "openmpi2-config-2.1.6-15.1.aarch64.rpm"
RPM_HASH = "837aaa345a830dc3312036533c6cd64a7910082d6af67ab8840398cb73dfaeb444afdbf5be68aaaef36a38de74a34f7fd0bbc050d724e76cc36043cf8b3bbd21"

RPROVIDES:${PN} += "config-openmpi2-config \
openmpi-runtime-config \
openmpi2-config"

RDEPENDS:${PN} += ""

inherit rpm
