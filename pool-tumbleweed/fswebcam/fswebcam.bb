SUMMARY = "Tiny and flexible webcam program"
DESCRIPTION = "Tiny and flexible webcam program for capturing images from a V4L1/V4L2 \
device, and overlaying a caption or image."
LICENSE = "GPL-2.0-only"

PV = "20200725"

RPM_NAME = "fswebcam-20200725-1.12.aarch64.rpm"
RPM_HASH = "86871d5b17e9473a8d057fff283dde69a86c6560b12575ef3ff9cfb1be4b42828ec85f6137b99c2bfdb8715dca4418ebb58851082f23bedff176712f2ce1beea"

RPROVIDES:${PN} += "fswebcam"

RDEPENDS:${PN} += "gd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm
