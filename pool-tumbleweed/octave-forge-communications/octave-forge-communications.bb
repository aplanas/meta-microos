SUMMARY = "Digital Communications for Octave"
DESCRIPTION = "Digital Communications, Error Correcting Codes (Channel Code), \
Source Code functions, Modulation and Galois Fields. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "octave-forge-communications-1.2.4-1.9.aarch64.rpm"
RPM_HASH = "b74b9405e4a204b5d2fa3ad7b28b9e0e63dbeb57a4b8bcd5baac2477e07f40c74705b2d4c56ae52cc90dcafb946f5a03ba4bee0a59c9d76c3ab6e5a4e15fff37"

RPROVIDES:${PN} += "octave-forge-communications"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-cli \
octave-forge-signal"

inherit rpm
