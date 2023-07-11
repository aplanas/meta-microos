SUMMARY = "JavaScript bindings based on gobject-introspection and Mozilla"
DESCRIPTION = "This module contains JavaScript bindings based on gobject-introspection and the \
Mozilla SpiderMonkey JavaScript engine."
LICENSE = "LGPL-2.0-or-later & MIT"

PV = "1.76.2"

RPM_NAME = "gjs-1.76.2-1.1.aarch64.rpm"
RPM_HASH = "1259a2aac05a8c891035236d9ead728b0ccaa3ce04028f2915ab2a4deadf0d04fee0bb03b403174bc5e9db12dd979fa61ead859f087519ceb5922318c7591d61"

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
