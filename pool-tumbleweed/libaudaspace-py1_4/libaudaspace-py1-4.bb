SUMMARY = "Python Bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace-py1_4-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "e31c5e1e2016214bd97ca098f5add4b2d21ea0fb8a47a4790f61d5df37a3c275af51a13b5dc9360af83881ce40b9cf6f6e60cae8cdeb7fc88e19901a96a8dfe1"

RPROVIDES:${PN} += "libaudaspace-py.so.1.4 \
libaudaspace-py1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.11.so.1.0 \
libstdc++.so.6"

inherit rpm
