SUMMARY = "C bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace-c1_4-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "ff5ff5934c54cfab8fb3eb0b32e43396842b5f2a82f5183869a2bec9d8ab8de22a7dc3aa815338c65362a975a868efcd09ed97de44a5e73bd845dfc0625548ae"

RPROVIDES:${PN} += "libaudaspace-c.so.1.4 \
libaudaspace-c1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
