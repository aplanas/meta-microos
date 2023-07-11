SUMMARY = "Routines for Non-Uniform Rational B-Splines for Octave"
DESCRIPTION = "Collection of routines for the creation, and manipulation of \
Non-Uniform Rational B-Splines (NURBS). \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.3"

RPM_NAME = "octave-forge-nurbs-1.4.3-1.4.aarch64.rpm"
RPM_HASH = "b98837ce8251c1435f377af59df2ab738bc6e7565318aaafc32cc659131e5bce418057e59110fa7e50ceafcc77b63c27ee1c60908eafe31960b6cdab2fe81010"

RPROVIDES:${PN} += "octave-forge-nurbs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli"

inherit rpm
