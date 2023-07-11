SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l2 offers the v4l2 API on top of v4l2 devices, while adding for the \
application transparent libv4lconvert conversion where necessary. \
 \
This package contains shared lib for packages that use libv4l2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l2-0-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "bb9e2a9fca52644adacb858eda9a7d975a20f5adac8226d9f6660ce27d3b3eaa19a97a333933b1e94b3e806783167b612f5d1e4af62b396b407c6014f4b651fd"

RPROVIDES:${PN} += "libv4l2-0 \
libv4l2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l \
libv4lconvert.so.0"

inherit rpm
