SUMMARY = "Miscellaneous functions for Octave"
DESCRIPTION = "Miscellaneous functions for Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "octave-forge-miscellaneous-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "0e8c9edf2ad917a7184b4646250da37efa55a97dbc45eedd86537201e7fd761434d626ee1f87966df7ff8969833b8b421911aa439b5d5944bb17ed791cfd90d7"

RPROVIDES:${PN} += "octave-forge-miscellaneous"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-cli \
octave-forge-general \
units"

inherit rpm
