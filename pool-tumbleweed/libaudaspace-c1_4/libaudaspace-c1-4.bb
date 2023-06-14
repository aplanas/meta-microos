SUMMARY = "C bindings for audaspace"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace-c1_4-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "40f250c946697d00d3e36ff566725d9a193ae10c89106d3295d17fca74e061a95dc09b8093bd0f25483556c9e57449940f8ad431f1f8963a8667382d89c89559"

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
