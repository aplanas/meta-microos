SUMMARY = "Anthy Input Method Engine for SCIM"
DESCRIPTION = "Anthy Input Method Engine for SCIM"
LICENSE = "LGPL-2.1+"

PV = "1.3.2"

RPM_NAME = "scim-anthy-1.3.2-1.30.aarch64.rpm"
RPM_HASH = "e918749c4d1e06db7933b99cae33289c96d2722e0080f8d0b13eecc2dd1a6374204c4aac2d861e2a5ba38e6eb74ba94cceb75a1e9613132337c56430dbbf3130"

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
