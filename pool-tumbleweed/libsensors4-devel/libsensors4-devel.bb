SUMMARY = "Hardware health monitoring library"
DESCRIPTION = "libsensors offers a way for applications to access the hardware \
monitoring chips of the system. A system-dependent configuration file \
controls how the different inputs are labeled and what scaling factors \
have to be applied for the specific hardware, so that the output makes \
sense to the user."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.0"

RPM_NAME = "libsensors4-devel-3.6.0-8.7.aarch64.rpm"
RPM_HASH = "82f218893366a553d68105ca0e01e587718bb6c97f78ecb4e18dec71c76a4d2d4e532396ff764269665e3abf573c4ce8e184f78592c0d7c3357a0998a023867b"

RPROVIDES:${PN} += "libsensors4-devel \
sensors-/usr/include/sensors/sensors.h"

RDEPENDS:${PN} += "glibc-devel \
libsensors4"

inherit rpm
