SUMMARY = "Non-linear optimization toolkit for Octave"
DESCRIPTION = "Non-linear optimization toolkit. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.6.2"

RPM_NAME = "octave-forge-optim-1.6.2-1.8.aarch64.rpm"
RPM_HASH = "6895f5f96934f9c658955421baf5c2b2232c210f4f3a21a757ec8d46bbb90b13782dcca8d24d6f851122ad53f7805bd246f67d6693b90744e126434dbeabf3d5"

RPROVIDES:${PN} += "octave-forge-optim"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
octave-cli \
octave-forge-parallel \
octave-forge-statistics \
octave-forge-struct"

inherit rpm
