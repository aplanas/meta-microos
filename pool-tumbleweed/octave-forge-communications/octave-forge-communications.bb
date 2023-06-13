SUMMARY = "Digital Communications for Octave"
DESCRIPTION = "Digital Communications, Error Correcting Codes (Channel Code), \
Source Code functions, Modulation and Galois Fields. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "octave-forge-communications-1.2.4-1.8.aarch64.rpm"
RPM_HASH = "49cc3134318869dbc067e6da6a4488aadad3f4bff6029db110a0a0f1b39792ed122daeaad6e192f14fb80e2d164b391d757a1961dbe077b8b7f79876f23a4c60"

RPROVIDES:${PN} += "octave-forge-communications \
octave-forge-communications(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
octave-cli \
octave-forge-signal"

inherit rpm
