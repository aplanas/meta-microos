SUMMARY = "Development files for flatbuffers"
DESCRIPTION = "FlatBuffers is a serialization library for games and other memory constrained programs. \
FlatBuffers allows to directly access serialized data without unpacking/parsing \
it first, while still having great forwards/backwards compatibility. \
 \
This package provides the libflatbuffers headers, development libraries, \
and tools."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "flatbuffers-devel-23.3.3-2.2.aarch64.rpm"
RPM_HASH = "c5fe4dd90b93c13c85e3095fdc91af1fdcdc0fbde7cd7fcf11036aa762551debedde865d2183e05cd626f99babbb1f2310e1ffe999ff976c0cda316e100019cc"

RPROVIDES:${PN} += "cmake-flatbuffers \
flatbuffers-devel \
flatbuffers-devel-static \
pkgconfig-flatbuffers"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflatbuffers23-3-3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
