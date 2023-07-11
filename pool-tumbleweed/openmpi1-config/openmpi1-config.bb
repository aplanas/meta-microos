SUMMARY = "Runtime configuration files for openMPI  version 1.10.7"
DESCRIPTION = "OpenMPI is an implementation of the Message Passing Interface, a \
standardized API typically used for parallel and/or distributed \
computing. OpenMPI is the merged result of four prior implementations \
where the team found for them to excel in one or more areas, \
such as latency or throughput. \
 \
This RPM contains the configuration files for OpenMPI runtime (Version 1 or 2)."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi1-config-1.10.7-7.6.aarch64.rpm"
RPM_HASH = "fcef20df1999c74b4c457589ece657c37fa48b77ec958b0b15c5e74185aa94d14d3e3914d6b0ca97ab607210927350e5e40745e215e54f5ba7376f9ca5a01303"

RPROVIDES:${PN} += "config-openmpi1-config \
openmpi-runtime-config \
openmpi1-config"

RDEPENDS:${PN} += ""

inherit rpm
