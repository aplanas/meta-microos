SUMMARY = "Development files for libscca"
DESCRIPTION = "libscca is a library to access the Windows Prefetch File (PF) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libscca."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230716"

RPM_NAME = "libscca-devel-20230716-2.1.aarch64.rpm"
RPM_HASH = "13cad7da741198fbaea627107ceba96ac550fc3710bae34b25ede3f4b51a5b6a007ccbde20c6fabad3e4d22173214605aeb3d43667670527a9a8fb6daa4bad3d"

RPROVIDES:${PN} += "libscca-devel \
pkgconfig-libscca"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libscca1"

inherit rpm
