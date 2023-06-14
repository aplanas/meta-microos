SUMMARY = "Anthy Input Method Engine for SCIM"
DESCRIPTION = "Anthy Input Method Engine for SCIM"
LICENSE = "LGPL-2.1+"

PV = "1.3.2"

RPM_NAME = "scim-anthy-1.3.2-1.29.aarch64.rpm"
RPM_HASH = "1df4a6f6b96b3408af6e9dc168ad952d4bfd2a81cf7855e2525372ccfdfdaf9a67273086d1003ec84b3c54a1cd6fc673b106fb06d49d3f46cc19469c55ffca29"

RPROVIDES:${PN} += "scim-anthy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libanthy.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6"

inherit rpm
