SUMMARY = "Miscellaneous functions for Octave"
DESCRIPTION = "Miscellaneous functions for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "octave-forge-miscellaneous-1.3.0-2.2.aarch64.rpm"
RPM_HASH = "f08d02bf2c308b053a716d3a8275966c3d5e0111719ecc8aa65e6b7f98c48d22a5ce66eb84950f2ee9f28f9bde4a301638789146c9dad59933d38b7d3faac88a"

RPROVIDES:${PN} += "octave-forge-miscellaneous"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli \
octave-forge-general \
units"

inherit rpm
