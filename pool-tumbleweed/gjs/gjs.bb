SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.0"

RPM_NAME = "gjs-1.76.0-1.1.aarch64.rpm"
RPM_HASH = "e8764ac32675881d2fa71796256bd6684b9ec0179b7c470a8c8f71e2b1b6ee0146a4185999ebf71a838dd53d40c44109cf34e04bbc81b42da33dbc65d313d3a9"

RPROVIDES:${PN} += "gjs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgjs.so.0 \
libgjs0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmozjs-102.so.0 \
libstdc++.so.6"

inherit rpm
