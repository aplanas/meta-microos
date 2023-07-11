SUMMARY = "Network Monitoring Tool"
DESCRIPTION = "Argus is a network monitoring tool. \
 \
Documentation can be found in /usr/share/doc/packages/argus."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.1-only & MIT"

PV = "3.0.8.3"

RPM_NAME = "argus-3.0.8.3-3.4.aarch64.rpm"
RPM_HASH = "9670b450a868524a152a1cf8ec338dda5c87d32a5e6bd88060c4a824556ab2cdb6ba03047f89ae1aa6f7d87696f3db3e46d7c6a50c5e8bc4f4452d3f7014eb0f"

RPROVIDES:${PN} += "argus"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh"

inherit rpm
