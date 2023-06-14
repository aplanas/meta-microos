SUMMARY = "Python Bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace-py1_4-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "02397ba7bf72478059950e950193449cf25945aa41d41befc61f688cf715bb8cbadcd6749122076476afa7e1852b9ccf32a2ca2fdec5fecee92d638bd5a2642b"

RPROVIDES:${PN} += "libaudaspace-py.so.1.4 \
libaudaspace-py1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libc.so.6 \
libgcc-s.so.1 \
libpython3.10.so.1.0 \
libstdc++.so.6"

inherit rpm
