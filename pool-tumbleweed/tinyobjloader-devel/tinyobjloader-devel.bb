SUMMARY = "Development files for tinyobjloader"
DESCRIPTION = "A single-file Wavefront .obj file loader written in C++. \
No dependency except for C++ STL. It can parse over 10M polygons with \
moderate memory and time. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of tinyobjloader."
LICENSE = "MIT"

PV = "2.0.0rc9"

RPM_NAME = "tinyobjloader-devel-2.0.0rc9-1.5.aarch64.rpm"
RPM_HASH = "2a82ebe40fed82dd16d2b22963f05d9218562fe90dd899df0e24eb6d26c2c65a0db011af94ba74909a8eaa89445b39648d475f3cde7ad4de414c77423d718cde"

RPROVIDES:${PN} += "pkgconfig-tinyobjloader \
tinyobjloader-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyobjloader2"

inherit rpm
