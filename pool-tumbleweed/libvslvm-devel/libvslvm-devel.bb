SUMMARY = "Header files and libraries for developing applications for libvslvm"
DESCRIPTION = "Header files and libraries for developing applications for libvslvm \
 \
See libvslvm for additional details. \
 \
This package contains libraries and header files for developing \
applications that want to make use of libvslvm."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "libvslvm-devel-20221025-4.1.aarch64.rpm"
RPM_HASH = "b878cbe001ae786b385c058d03ff76945b163cebb074fdf306567e37e42a2aa6c0c753c69c802ec61274efb910a40222e8263a03337028f2495c2f3ba3511a34"

RPROVIDES:${PN} += "libvslvm-devel \
pkgconfig-libvslvm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvslvm1"

inherit rpm
