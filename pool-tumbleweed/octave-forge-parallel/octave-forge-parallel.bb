SUMMARY = "Parallel Computing for Octave"
DESCRIPTION = "Parallel execution package. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.1"

RPM_NAME = "octave-forge-parallel-4.0.1-3.1.aarch64.rpm"
RPM_HASH = "7376ab236204d4c4df601c89a41391e37c3d4e1a3b287884ef0d571818f4765ab6007180526690282ddfd9c937c8244db887f049408e5b7081f4b89bddfd1a49"

RPROVIDES:${PN} += "octave-forge-parallel"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-struct"

inherit rpm
