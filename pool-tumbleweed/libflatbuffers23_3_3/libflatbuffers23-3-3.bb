SUMMARY = "Memory Efficient Serialization Library"
DESCRIPTION = "FlatBuffers is a serialization library for games and other memory constrained programs. \
FlatBuffers allows to directly access serialized data without unpacking/parsing \
it first, while still having great forwards/backwards compatibility. \
 \
This package provides the libflatbuffers shared library."
LICENSE = "Apache-2.0"

PV = "23.3.3"

RPM_NAME = "libflatbuffers23_3_3-23.3.3-2.1.aarch64.rpm"
RPM_HASH = "b8842d45d90f0898827df5de93709f91ab6fc2ac7e6bbe91d9cee12086e486df0e0591418ca34d03ef6d1b7f1d98e1596f47fa277f12cc526e20f3afcc8a19ff"

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
