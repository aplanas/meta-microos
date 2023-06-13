SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l1 offers the (deprecated) v4l1 API on top of v4l2 devices, independent \
of the drivers for those devices supporting v4l1 compatibility (which many \
v4l2 drivers do not). \
 \
This package contains shared lib for packages that use libv4l1."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l1-0-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "d63b9a29fcadcd6c1efaf33a86e0928e5c45e0c7b26d8c0cd7d58d7a628dbd981a11014430f88d5ab6857afaa243e66f7f479a347361ba4135239964075c23fa"

RPROVIDES:${PN} += "libv4l1-0 \
libv4l1-0(aarch-64) \
libv4l1.so.0()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libv4l \
libv4l2.so.0()(64bit)"

inherit rpm
