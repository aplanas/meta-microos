SUMMARY = "Development files for libv4l"
DESCRIPTION = "The libv4l-devel package contains libraries and header files for \
developing applications that use libv4l."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l-devel-1.24.1-1.4.aarch64.rpm"
RPM_HASH = "a3bf3823b64b56526e5b9edeb0c33cb197115462403ccb8e53365da97851566c4d0b3ca733dc07303270387ad7218ddc5ee4c3a797a4e619d9f760972a9f0385"

RPROVIDES:${PN} += "libv4l-devel \
pkgconfig-libv4l1 \
pkgconfig-libv4l2 \
pkgconfig-libv4l2rds \
pkgconfig-libv4lconvert"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libv4l1-0 \
libv4l2-0 \
libv4l2rds0 \
libv4lconvert0 \
pkgconfig-libv4l2 \
pkgconfig-libv4lconvert"

inherit rpm
