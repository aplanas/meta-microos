SUMMARY = "Development files for libmount"
DESCRIPTION = "Files to develop applications using the libmount library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libmount-devel-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "8d3a6a70497ef126679f379174ea0aa37e2c2a13bb101e9f7f5e2c6daabba67af7b1f43479eb7e90d95244c79125bb5609615bd8906536955cab862917b3dd1e"

RPROVIDES:${PN} += "libmount-devel \
pkgconfig-mount"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmount1 \
pkgconfig-blkid \
pkgconfig-libselinux"

inherit rpm
