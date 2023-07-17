SUMMARY = "Development files for libmodi"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodi."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "libmodi-devel-20221023-3.12.aarch64.rpm"
RPM_HASH = "edd6201c19a94d43db9083627b8738ebf03bed92c309574a3c87628be088368ef8442e37fbb6829a1e2245e70e32b7b68c5f497048abbac25f5335dea477a3d8"

RPROVIDES:${PN} += "libmodi-devel \
pkgconfig-libmodi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libmodi1"

inherit rpm
