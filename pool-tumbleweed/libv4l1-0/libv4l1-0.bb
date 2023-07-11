SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l1 offers the (deprecated) v4l1 API on top of v4l2 devices, independent \
of the drivers for those devices supporting v4l1 compatibility (which many \
v4l2 drivers do not). \
 \
This package contains shared lib for packages that use libv4l1."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l1-0-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "58c5007b9385c6697b117cf1976273349e6d8294eaa1ee5a3ea4de9ae188ef035c8b4f875b911add09667aba95cd7e514a82648c6023360364a819fcca13c143"

RPROVIDES:${PN} += "libv4l1-0 \
libv4l1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l \
libv4l2.so.0"

inherit rpm
