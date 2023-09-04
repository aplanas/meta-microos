SUMMARY = "Visualization tools for the Performance Co-Pilot toolkit"
DESCRIPTION = "Visualization tools for the Performance Co-Pilot toolkit. \
The pcp-gui package primarily includes visualization tools for \
monitoring systems using live and archived Performance Co-Pilot \
(PCP) sources."
LICENSE = "GPL-2.0+ & LGPL-2.0+"

PV = "5.2.5"

RPM_NAME = "pcp-gui-5.2.5-3.8.aarch64.rpm"
RPM_HASH = "c426b7c675f7bff565e8e7092dd8cf6f34d13cd3225bc18dde5cde0a66d7f760a73b1a89b47c5c16ca3321dd805471bd305559ac2296a5f8abf28fa0a12f89a9"

RPROVIDES:${PN} += "config-pcp-gui \
pcp-gui"

RDEPENDS:${PN} += "/usr/bin/sh \
dejavu-fonts \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcp.so.3 \
libstdc++.so.6"

inherit rpm
