SUMMARY = "Development files for tinyobjloader"
DESCRIPTION = "A single-file Wavefront .obj file loader written in C++. \
No dependency except for C++ STL. It can parse over 10M polygons with \
moderate memory and time. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of tinyobjloader."
LICENSE = "MIT"

PV = "2.0.0rc9"

RPM_NAME = "tinyobjloader-devel-2.0.0rc9-1.4.aarch64.rpm"
RPM_HASH = "ca5be87c350a6b20be0307ebad881b72cf2ad49261fbfa57b94c37bdea287c2aac0fa58c4328393f14f1d09e33c40bf7a6b03a9d156689f886b27d4684015273"

RPROVIDES:${PN} += "pkgconfig-tinyobjloader \
tinyobjloader-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtinyobjloader2"

inherit rpm
