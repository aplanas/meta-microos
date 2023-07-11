SUMMARY = "General tools for Octave"
DESCRIPTION = "General tools for Octave. \
This is part of Octave-Forge project."
LICENSE = "BSD-3-Clause & GPL-3.0-or-later"

PV = "2.1.2"

RPM_NAME = "octave-forge-general-2.1.2-2.6.aarch64.rpm"
RPM_HASH = "d496551ea0fe924d42a4ce940c7637dc60ce6e21875479aeb92baf933b81e492834223f63c683942adb98838ba9c24718c1d58c4ce2d2034248b02c67b51f29a"

RPROVIDES:${PN} += "octave-forge-general"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnettle.so.8 \
libstdc++.so.6 \
octave-cli"

inherit rpm
