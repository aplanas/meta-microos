SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy. \
 \
Relies on tuktape to do the javascript parsing"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-duktape-0.4.18-2.4.aarch64.rpm"
RPM_HASH = "dfc12d40b7f5cceeee47527cd3495e75896689ddf17560947cd09f9cd173330f3e143f7e6c8b0075bf4cac6c856452d122feffb216c8777acfaabadad0071b81"

RPROVIDES:${PN} += "libproxy1-pacrunner \
libproxy1-pacrunner-duktape"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libduktape.so.207 \
libgcc-s.so.1 \
libproxy.so.1 \
libproxy1 \
libstdc++.so.6"

inherit rpm
