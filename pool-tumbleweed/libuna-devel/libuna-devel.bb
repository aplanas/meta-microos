SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libuna-devel-20230710-1.1.aarch64.rpm"
RPM_HASH = "0e529bf34750f43fea2b2338ab3145f65e53c7c61fbbb28d32d40eb930ef3b19dddcd3dd09662c97d3291022a84db6df70bd01327153ae4ba8d590b32c63d924"

RPROVIDES:${PN} += "libuna-devel \
pkgconfig-libuna"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1"

inherit rpm
