SUMMARY = "Additional manipulation functions for Octave"
DESCRIPTION = "Additional manipulation functions. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later & BSD-2-Clause"

PV = "1.3.0"

RPM_NAME = "octave-forge-strings-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "44dbec52a60fccf1dab147b56c1f00846bd50e4815040377ced5a735cef897ada7cb1fe58d17b1f3cbc482a3bdd612b0618fef350a996a508208bddf9780380b"

RPROVIDES:${PN} += "octave-forge-strings"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpcre.so.1 \
libstdc++.so.6 \
octave-cli"

inherit rpm
