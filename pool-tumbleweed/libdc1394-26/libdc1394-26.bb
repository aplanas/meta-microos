SUMMARY = "1394-based Digital Camera Control library"
DESCRIPTION = "This library provides functionality for controlling any camera that \
conforms to the 1394-Based Digital Camera Specification (which can be \
found at http://www.1394ta.org/Download/Technology/Specifications/Camera120.pdf). \
It utilizes the low-level functionality provided by libraw1394 to \
communicate with the camera."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.7"

RPM_NAME = "libdc1394-26-2.2.7-1.1.aarch64.rpm"
RPM_HASH = "fd3202d13f01c316942590ab8536b8abefc7c8bde5b4ac632c36dc95d7911840a346df2260b217b196028508b724eba19bce82677d4196e97b4fb8280fe0b96b"

RPROVIDES:${PN} += "libdc1394-26 \
libdc1394.so.26"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libraw1394.so.11 \
libusb-1.0.so.0"

inherit rpm
