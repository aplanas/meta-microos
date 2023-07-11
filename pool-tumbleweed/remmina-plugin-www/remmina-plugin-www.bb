SUMMARY = "WWW Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the a plugin for Remmina which allows to login and \
to browse a page."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-www-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "8f6f17484ccd2dbf16fc6531f4c4bd77a404fbe1b36dcc6a7fc33d2cda593e43f0455da891fcf88869f2f712024cc5e3f07d20933a6182626370ba1ea3e6858b"

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
