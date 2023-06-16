SUMMARY = "Gcin gtk3 immodule"
DESCRIPTION = "gcin gtk3 immodule, support gtk3-based applications"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-gtk3-2.9.0-4.16.aarch64.rpm"
RPM_HASH = "50fd0531cf9c37d0c1bef72282f6dfbb36d15cb5a5c4416c217afc51de6cf1989ee771e9835bb5bd8d11509fa52e91cc11d8eb9073e8820a7e7046af4d5aa6ec"

RPROVIDES:${PN} += "gcin-gtk3 \
gcin-gtk3-immodule"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin \
gtk3-tools \
libc.so.6 \
libgcin-im-client.so.1 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
