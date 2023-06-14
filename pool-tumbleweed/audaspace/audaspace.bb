SUMMARY = "A High-Level Audio Library"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library. This package contains demo binaries."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-1.4.0-1.4.aarch64.rpm"
RPM_HASH = "4eff0aec498ac3f4276fffde7920aa4e8ff582bdefb282f9d6a50646ec8a8205aad99972047f62da263d2d87159c395ed7120b849c2ce6021ff8644ea00f96d7"

RPROVIDES:${PN} += "audaspace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libaudopenal.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
