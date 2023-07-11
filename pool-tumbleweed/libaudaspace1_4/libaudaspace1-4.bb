SUMMARY = "A high-level audio library"
DESCRIPTION = "Audaspace (pronounced 'outer space') is a high-level audio library written \
in C++ with language bindings for Python for example. It started out as the \
audio engine of the 3D modelling application Blender and is now released as \
a standalone library."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libaudaspace1_4-1.4.0-1.5.aarch64.rpm"
RPM_HASH = "0b28775eabb6e954f1b0de7b98f7ca7e155bd81c9c66e06772add8784f537ac4b7891c30a21eef77af09ac586c534fd5904f4325925e0b37713dd0b49f0e2e93"

RPROVIDES:${PN} += "libaudaspace.so.1.4 \
libaudaspace1-4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
