SUMMARY = "Data Files for SCIM Generic Table Input Method Module"
DESCRIPTION = "Data files for SCIM generic table input method module."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-0.5.14.1-2.32.aarch64.rpm"
RPM_HASH = "cab4e6f00e44a6ff7a53d9709f89333fd6214f9e253584d32e9f5e186af5aa8e8b605362d24a6523846420e45a70eac2f807691f7e8c071c458dd64286508f64"

RPROVIDES:${PN} += "scim-tables"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libscim-1.0.so.8 \
libscim-gtkutils-1.0.so.8 \
libstdc++.so.6"

inherit rpm
