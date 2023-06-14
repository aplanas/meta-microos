SUMMARY = "Programming Interface to the AV/C Specification"
DESCRIPTION = "libavc1394 is a programming interface to the AV/C (Audio/Video \
Control) specification. Applications use the library to control the \
tape transport mechanism on DV camcorders. However, there are many \
devices and functions of devices that can be controlled via AV/C."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "0.5.4"

RPM_NAME = "libavc1394-0-0.5.4-19.14.aarch64.rpm"
RPM_HASH = "61933e8067eea260e0a8196955afad0810948538eb36fb0c68fc3651a2de4c5b43b8f47739128f327bbe6eac162b8b9d8c9d4934f63b29418a7004ef1e83277f"

RPROVIDES:${PN} += "libavc1394-0 \
libavc1394.so.0 \
librom1394.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libraw1394.so.11"

inherit rpm
