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

RPM_NAME = "openmpi1-config-1.10.7-8.1.aarch64.rpm"
RPM_HASH = "c0c69e3fdd9230eb13f7acc1fd530fd63659e2eeb324ac3123baaea52f0698b4f01db36c4b66a395080d5fa2f96456ac8744f52923ceb9d90d17c96c5fdc1fb8"

RPROVIDES:${PN} += "config-openmpi1-config \
openmpi-runtime-config \
openmpi1-config"

RDEPENDS:${PN} += ""

inherit rpm
