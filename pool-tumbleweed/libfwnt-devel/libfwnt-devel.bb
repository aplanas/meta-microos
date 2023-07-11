SUMMARY = "Development files for libfwnt"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwnt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "libfwnt-devel-20220922-2.7.aarch64.rpm"
RPM_HASH = "9098287d236e81ce2d85a834dd7e1872085dc3ab467043db0e39bf2ce34ad51ca6c3b74c695218a6700fdeaa8fbf02173afa5658629346533a029e4b5a09053e"

RPROVIDES:${PN} += "libfwnt-devel \
pkgconfig-libfwnt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwnt1"

inherit rpm
