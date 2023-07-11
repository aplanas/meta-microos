SUMMARY = "A High-Level Audio Library"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library. This package contains demo binaries."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "audaspace-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "0b90d03cc7ec868f75831ea7e4ab3cd961dd1f71c28d7a3d1c021951d9616bdab4992e118d0801e5f566903fc55a42f1f334d0d2758e1c9da1c1977dd1fb0311"

RPROVIDES:${PN} += "audaspace"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaudaspace.so.1.4 \
libaudopenal.so \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
