SUMMARY = "Parallel Computing for Octave"
DESCRIPTION = "Parallel execution package. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "4.0.1"

RPM_NAME = "octave-forge-parallel-4.0.1-3.1.aarch64.rpm"
RPM_HASH = "7376ab236204d4c4df601c89a41391e37c3d4e1a3b287884ef0d571818f4765ab6007180526690282ddfd9c937c8244db887f049408e5b7081f4b89bddfd1a49"

RPROVIDES:${PN} += "octave-forge-parallel \
octave-forge-parallel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli \
octave-forge-struct"

inherit rpm
