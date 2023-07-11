SUMMARY = "Octave bindings to the GNU Scientific Library"
DESCRIPTION = "Octave bindings to the GNU Scientific Library. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "octave-forge-gsl-2.1.1-1.26.aarch64.rpm"
RPM_HASH = "ad6aa12a219614c77b288c38f9485de130b0b7f84b6a1e08c67d47926862fdd541ec60b3859b3b191fc88aadc2926c664f1c62ac5b59cdb88b1281ac4928406a"

RPROVIDES:${PN} += "octave-forge-gsl"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.27 \
libstdc++.so.6 \
octave-cli"

inherit rpm
