SUMMARY = "Development files for libv4l"
DESCRIPTION = "The libv4l-devel package contains libraries and header files for \
developing applications that use libv4l."
LICENSE = "LGPL-2.1-or-later"

PV = "1.24.1"

RPM_NAME = "libv4l-devel-1.24.1-1.3.aarch64.rpm"
RPM_HASH = "90c86919421a287b3e1e693c13bda740df925bf700ba0aefadad992436b36ba513144417d09ccfd84852d9f1df1f0c0093fda90d739f34e3543388586223584e"

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
