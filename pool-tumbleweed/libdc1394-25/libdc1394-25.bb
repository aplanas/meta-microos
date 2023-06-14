SUMMARY = "1394-based Digital Camera Control library"
DESCRIPTION = "This library provides functionality for controlling any camera that \
conforms to the 1394-Based Digital Camera Specification (which can be \
found at http://www.1394ta.org/Download/Technology/Specifications/Camera120.pdf). \
It utilizes the low-level functionality provided by libraw1394 to \
communicate with the camera."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.6"

RPM_NAME = "libdc1394-25-2.2.6-3.13.aarch64.rpm"
RPM_HASH = "c7f8bcfa986fa5cb3b3dc08db1526989c1db209e257086c168047505310cd60ae110911707f63447ecaba8c918952fa5303bf4202f2056f97cdbb543340bf650"

RPROVIDES:${PN} += "libdc1394-25 \
libdc1394.so.25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libraw1394.so.11 \
libusb-1.0.so.0"

inherit rpm
