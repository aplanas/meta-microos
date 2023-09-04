SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-webkit-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "ef575e79bc53859efd90bbc045891deb03370b91132fb68bb09f8343d567819470014920a4457a908067b6e7cf12ad140e06b62782c7163a64c507c126736eac"

RPROVIDES:${PN} += "libproxy1-pacrunner \
libproxy1-pacrunner-webkit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjavascriptcoregtk-4.0.so.18 \
libproxy.so.1 \
libproxy1 \
libstdc++.so.6"

inherit rpm
