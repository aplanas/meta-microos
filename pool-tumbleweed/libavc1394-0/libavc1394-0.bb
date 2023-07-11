SUMMARY = "Programming Interface to the AV/C Specification"
DESCRIPTION = "libavc1394 is a programming interface to the AV/C (Audio/Video \
Control) specification. Applications use the library to control the \
tape transport mechanism on DV camcorders. However, there are many \
devices and functions of devices that can be controlled via AV/C."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-0-0.5.4-19.15.aarch64.rpm"
RPM_HASH = "ed24ff3cf6a39a048af3b6cfdac3ba2e3a66ca5db73aa1e8cbc3ba6e350b13352c90d76aa550831ddabc6c799e833ec2d98ec3f889c3d227d331a39e860c908e"

RPROVIDES:${PN} += "libavc1394-0 \
libavc1394.so.0 \
librom1394.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libraw1394.so.11"

inherit rpm
