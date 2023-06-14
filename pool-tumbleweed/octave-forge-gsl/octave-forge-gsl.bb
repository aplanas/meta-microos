SUMMARY = "Octave bindings to the GNU Scientific Library"
DESCRIPTION = "Octave bindings to the GNU Scientific Library. \
This is part of the Octave-Forge project."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "octave-forge-gsl-2.1.1-1.25.aarch64.rpm"
RPM_HASH = "66b1f5fe4d8cd90ef8be01aef96427802b268f941f70f9f6a401be9986d9335906839b57f42ee7eacba1697cdba999b989736d817161112251eb3ea8d21170f2"

RPROVIDES:${PN} += "octave-forge-gsl"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgsl.so.27 \
libstdc++.so.6 \
octave-cli"

inherit rpm
