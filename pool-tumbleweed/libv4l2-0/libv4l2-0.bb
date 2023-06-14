SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l2 offers the v4l2 API on top of v4l2 devices, while adding for the \
application transparent libv4lconvert conversion where necessary. \
 \
This package contains shared lib for packages that use libv4l2."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l2-0-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "a255cfc12425ff7d95c3803ad77a1422f08842045dba5477ec9819483225cdf1cca059b87ec725bc3a2294dc2f0cfe8527e2a079f68cb58818e241e253164fed"

RPROVIDES:${PN} += "libv4l2-0 \
libv4l2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l \
libv4lconvert.so.0"

inherit rpm
