SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-webkit-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "403056a1d47b5eeb66de54f6982ac7e8274bef4fee007122e448ac1e0786cd547ce21aa4296d16cdc55864d90a1ead5ba8accc2dfd55897469b26e28372902fe"

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
