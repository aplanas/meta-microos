SUMMARY = "Hardware health monitoring library"
DESCRIPTION = "libsensors offers a way for applications to access the hardware \
monitoring chips of the system. A system-dependent configuration file \
controls how the different inputs are labeled and what scaling factors \
have to be applied for the specific hardware, so that the output makes \
sense to the user."
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.0"

RPM_NAME = "libsensors4-3.6.0-8.8.aarch64.rpm"
RPM_HASH = "2b2f673be5ce4bbd9783628cf0d707bec0059dbb8e345e368b821c2174540d86b2b4dc10b912914d75d0d4ff7a9ea42f6861e44c795bb8890094bda9c5b530a5"

RPROVIDES:${PN} += "config-libsensors4 \
libsensors.so.4 \
libsensors4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
