SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.0"

RPM_NAME = "gjs-1.76.0-1.1.aarch64.rpm"
RPM_HASH = "e8764ac32675881d2fa71796256bd6684b9ec0179b7c470a8c8f71e2b1b6ee0146a4185999ebf71a838dd53d40c44109cf34e04bbc81b42da33dbc65d313d3a9"

RPROVIDES:${PN} += "gjs \
gjs(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libgjs.so.0()(64bit) \
libgjs0 \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmozjs-102.so.0()(64bit) \
libmozjs-102.so.0(mozjs_102)(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
