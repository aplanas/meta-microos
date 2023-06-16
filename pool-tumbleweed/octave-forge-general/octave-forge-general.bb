SUMMARY = "General tools for Octave"
DESCRIPTION = "General tools for Octave. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "octave-forge-general-2.1.2-2.5.aarch64.rpm"
RPM_HASH = "5b8c80ecd173eeea0a1ed09eea1a5461afa85577e7d0e8ad61b0693bd451c4264577fb814ebe2eb66ab3e13ed05cf755e4e35259b4162e21211ba2e07951f1fd"

RPROVIDES:${PN} += "octave-forge-general"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnettle.so.8 \
libstdc++.so.6 \
octave-cli"

inherit rpm
