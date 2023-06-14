SUMMARY = "WWW Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the a plugin for Remmina which allows to login and \
to browse a page."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.30"

RPM_NAME = "remmina-plugin-www-1.4.30-1.1.aarch64.rpm"
RPM_HASH = "228eeff17f6591a183760841bd4ff1182dddd327df19739cac4355e23951294eecbfd3d07cf3a56356dbf42ffa7df0bd8590578ab4a7ed4fb1d30381e3edc2c5"

RPROVIDES:${PN} += "remmina-plugin-www"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libsoup-3.0.so.0 \
libwebkit2gtk-4.0.so.37 \
remmina"

inherit rpm
