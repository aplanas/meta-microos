SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy. \
 \
Relies on tuktape to do the javascript parsing"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-duktape-0.4.18-2.3.aarch64.rpm"
RPM_HASH = "5ef812603b7aaf8ff4a5ddcf16b07124dce0b914fa4574b68d9bf63f6cc167f2bf668225bb67f268da9d2924642178d8ac88c228ce0cd40179c2782b5c608e5d"

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
