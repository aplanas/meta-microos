SUMMARY = "Parallel Computing for Octave"
DESCRIPTION = "Parallel execution package. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.1"

RPM_NAME = "octave-forge-parallel-4.0.1-3.2.aarch64.rpm"
RPM_HASH = "54a66f649ed9d70d11201026080ce0d15409bb19fee6b28e5ad1a6d04742106a7e97e7a691dffed4add17c5fc4420826e88e625a4556be09918f7770e0bbd5e4"

RPROVIDES:${PN} += "octave-forge-parallel"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnutls.so.30 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-struct"

inherit rpm
