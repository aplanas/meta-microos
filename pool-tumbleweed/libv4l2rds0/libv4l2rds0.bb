SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l2rds offers decoding raw RDS data from V4L2 Radio devices and simple ways \
to access the received RDS information. \
 \
This package contains shared lib for packages that use libv4l2rds."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l2rds0-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "14893f35ed6c2325de8d88dbc80f90199b428c00b9152f6000ed318d962ecbdff3313d3a3c6f079ca23521efe9893e8213b352ced0e934a4e24954095dee1343"

RPROVIDES:${PN} += "libv4l2rds.so.0 \
libv4l2rds0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libv4l"

inherit rpm
