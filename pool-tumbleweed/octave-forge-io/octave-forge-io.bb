SUMMARY = "Input/Output in external formats from Octave"
DESCRIPTION = "Input/Output in external formats. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later"

PV = "2.6.4"

RPM_NAME = "octave-forge-io-2.6.4-1.7.aarch64.rpm"
RPM_HASH = "fe0ae2a63b7ef22f4081d6af070507eefc84a1fdee31dc95510f296ce6046156286bf225557f3d8f91428060a399bbea361036286212fca2901add441e72d04f"

RPROVIDES:${PN} += "octave-forge-io"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli \
xerces-j2"

inherit rpm
