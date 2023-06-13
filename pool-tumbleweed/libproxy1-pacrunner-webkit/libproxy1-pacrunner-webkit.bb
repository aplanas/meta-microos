SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-webkit-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "2fee9f7a2f79864f4e7f7f2bd832920f4654970f32fba4b4ca9d83b9bf7d2fe6913865b467e15a9d0843494f672bb7c54a6d108b724b906e88b9e274cfd0b8ac"

RPROVIDES:${PN} += "libproxy1-pacrunner \
libproxy1-pacrunner-webkit \
libproxy1-pacrunner-webkit(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libjavascriptcoregtk-4.0.so.18()(64bit) \
libproxy.so.1()(64bit) \
libproxy1 \
libstdc++.so.6()(64bit)"

inherit rpm
