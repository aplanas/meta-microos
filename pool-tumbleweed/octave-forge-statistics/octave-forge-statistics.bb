SUMMARY = "Additional statistics functions for Octave"
DESCRIPTION = "Additional statistics functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & SUSE-Public-Domain"

PV = "1.5.4"

RPM_NAME = "octave-forge-statistics-1.5.4-1.2.aarch64.rpm"
RPM_HASH = "26dfd65ba40991702eb8f0763fe66fad7dd8100d244f068711aa3f512e30e7bf7706f6c166e7725dedcc47d993c3dcdde0b272896b73c6b379e2fbd4ca70362f"

RPROVIDES:${PN} += "octave-forge-statistics"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
