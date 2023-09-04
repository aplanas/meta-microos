SUMMARY = "Development files for libwrc, a Windows Resouce Compiler format support library"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwrc."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc-devel-20230318-2.1.aarch64.rpm"
RPM_HASH = "28ee368492d0cb0fa8b7e9c635f7349f9ea7aa827f3ef5e8519534925835db9ba6e4af2e445666b4ce8412a6d3d989767e1ebed2d70bc8c4c202c34fbcceb76c"

RPROVIDES:${PN} += "libwrc-devel \
pkgconfig-libwrc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwrc1"

inherit rpm
