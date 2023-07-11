SUMMARY = "Hardware health monitoring library"
DESCRIPTION = "libsensors offers a way for applications to access the hardware \
monitoring chips of the system. A system-dependent configuration file \
controls how the different inputs are labeled and what scaling factors \
have to be applied for the specific hardware, so that the output makes \
sense to the user."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.0"

RPM_NAME = "libsensors4-devel-3.6.0-8.8.aarch64.rpm"
RPM_HASH = "aefb1010187408349bbb077d131536a549892599cd2a66d631a9357297c60de447e01b7a0a9b3d9f5a9a27b2bc2af49ba78c4bea0ccf0f1e4ab53c96a83e6b22"

RPROVIDES:${PN} += "libsensors4-devel \
sensors-/usr/include/sensors/sensors.h"

RDEPENDS:${PN} += "glibc-devel \
libsensors4"

inherit rpm
