SUMMARY = "Memory Efficient Serialization Library"
DESCRIPTION = "FlatBuffers is a serialization library for games and other memory constrained programs. \
FlatBuffers allows to directly access serialized data without unpacking/parsing \
it first, while still having great forwards/backwards compatibility. \
 \
This package provides the libflatbuffers shared library."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "libflatbuffers23_3_3-23.3.3-2.2.aarch64.rpm"
RPM_HASH = "e192021d59a5bf1d686e40bad03a14dd359f264043994e561aa0b8893b878551d7f5ae9f45f67c87595dda984184889ee644fdfd9e3113082c87e7f61729a9b0"

RPROVIDES:${PN} += "libflatbuffers \
libflatbuffers.so.23.3.3 \
libflatbuffers23-3-3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
