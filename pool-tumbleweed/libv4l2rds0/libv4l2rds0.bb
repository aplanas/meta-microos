SUMMARY = "Video4linux support library"
DESCRIPTION = "libv4l2rds offers decoding raw RDS data from V4L2 Radio devices and simple ways \
to access the received RDS information. \
 \
This package contains shared lib for packages that use libv4l2rds."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l2rds0-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "b942373ead91ec08db477e5e86f50b41d7b2877b7e29980217c2f828729bca45e70caac7cfe4356f158ebf878097beff3ce7c6452f3476b8e2da4c36f9940e3c"

RPROVIDES:${PN} += "libv4l2rds.so.0()(64bit) \
libv4l2rds0 \
libv4l2rds0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libv4l"

inherit rpm
