SUMMARY = "Wavefront .obj file loader"
DESCRIPTION = "A single-file Wavefront .obj loader written in C++. \
It can parse over 10M polygons with moderate memory and time."
LICENSE = "MIT"

PV = "2.0.0rc9"

RPM_NAME = "libtinyobjloader2-2.0.0rc9-1.4.aarch64.rpm"
RPM_HASH = "2597dc121b3577d75396b75657b42687988ec62ecf5da387d791fe955f440c8ddb47950fb242c76da638bf19e3bbddf959dfe1c3f9f9fdb78e70c6487f60259a"

RPROVIDES:${PN} += "libtinyobjloader.so.2()(64bit) \
libtinyobjloader2 \
libtinyobjloader2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
