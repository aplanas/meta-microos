SUMMARY = "Development files for flatbuffers"
DESCRIPTION = "FlatBuffers is a serialization library for games and other memory constrained programs. \
FlatBuffers allows to directly access serialized data without unpacking/parsing \
it first, while still having great forwards/backwards compatibility. \
 \
This package provides the libflatbuffers headers, development libraries, \
and tools."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "flatbuffers-devel-23.3.3-2.1.aarch64.rpm"
RPM_HASH = "1a1cbf9a97f2df7d0ce269bc97022bd4a727067185f799e1897bef5a27bbd9bd62b82fb7f82db666828306153ac5261aa3b3a6c77831c6a469a9820920e433d9"

RPROVIDES:${PN} += "cmake(flatbuffers) \
flatbuffers-devel \
flatbuffers-devel(aarch-64) \
flatbuffers-devel-static \
pkgconfig(flatbuffers)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libflatbuffers23_3_3 \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
