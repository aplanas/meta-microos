SUMMARY = "Data Files for SCIM Generic Table Input Method Module"
DESCRIPTION = "Data files for SCIM generic table input method module."
LICENSE = "GPL-2.0+"

PV = "0.5.14.1"

RPM_NAME = "scim-tables-0.5.14.1-2.31.aarch64.rpm"
RPM_HASH = "fc17d40c8136a486587b06274b69c731cd0eb1b2e1120d4c13cf90755580b23966ad5c8f5ffa594d942d235c207665957e70bbca4099655abc597735d962e8b3"

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
