SUMMARY = "Input/Output in external formats from Octave"
DESCRIPTION = "Input/Output in external formats. \
This is part of Octave-Forge project."
LICENSE = "BSD-2-Clause & GPL-3.0-or-later"

PV = "2.6.4"

RPM_NAME = "octave-forge-io-2.6.4-1.8.aarch64.rpm"
RPM_HASH = "b8a5866df8e24e9ab035cb894832936c9d806e3301828e71633e548c6dd8e9c7d654b106c599ab91e1ec80553f5a499307d854b61f21cd66aeda099415edeb98"

RPROVIDES:${PN} += "octave-forge-io"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli \
xerces-j2"

inherit rpm
