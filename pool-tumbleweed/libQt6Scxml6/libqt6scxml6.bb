SUMMARY = "Qt 6 Scxml library"
DESCRIPTION = "The Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "libQt6Scxml6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "faa1464d61cf2cd800f8735e6dfc34315ccd7d846ad1993fc43346c94b923d858d56dfcce7ed89be244b9265d3b3d69a8367bca3363890e967c67a313f126a85"

RPROVIDES:${PN} += "libQt6Scxml.so.6 \
libQt6Scxml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
