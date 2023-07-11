SUMMARY = "Development files for libigscan"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libpff."
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "libsigscan-devel-20230109-1.6.aarch64.rpm"
RPM_HASH = "0debbb5e5731ba925c66a20a1ca29ec66d5c06f1d9e0b82682275417470952d1db8d408fd95b57163b2ef38d2103116e34395ad143752378029ee31f7f13518f"

RPROVIDES:${PN} += "libsigscan-devel \
pkgconfig-libsigscan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libsigscan1"

inherit rpm
