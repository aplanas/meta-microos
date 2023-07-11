SUMMARY = "Collection of video sources and filters plugins"
DESCRIPTION = "This package provides a collection of video sources and filters plugins, \
using the Frei0r API."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.0"

RPM_NAME = "frei0r-plugins-1.8.0-2.5.aarch64.rpm"
RPM_HASH = "412ed6cccd7d1c453175070d0f324874158a59c2b22701746d1a6459628ec380b73ef11f25a270c519e0f951fb3e3545793491d535db55464c854c74f512deeb"

RPROVIDES:${PN} += "frei0r-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgavl.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
