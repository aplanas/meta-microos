SUMMARY = "Performance Co-Pilot (PCP) development tools and documentation"
DESCRIPTION = "Performance Co-Pilot (PCP) documentation and tools for development."
LICENSE = "GPL-2.0+ & LGPL-2.1+"

PV = "5.2.5"

RPM_NAME = "pcp-devel-5.2.5-3.7.aarch64.rpm"
RPM_HASH = "e1668794149116c6fb55114013a3388aa98be1ec145fd5daaeace0666c1fe1072e0560adb9ba93ab9b791874c8eb0dc5c9f0fc864283e731d6d6f4e2d452e097"

RPROVIDES:${PN} += "config-pcp-devel \
pcp-devel"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpcp-pmda.so.3 \
libpcp.so.3"

inherit rpm
