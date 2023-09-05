SUMMARY = "Tools and libraries to work with AppStream metadata"
DESCRIPTION = "AppStream-Core makes it easy to access application information from the \
AppStream database over a nice GObject-based interface."
LICENSE = "LGPL-2.1-or-later"

PV = "0.16.3"

RPM_NAME = "AppStream-0.16.3-1.1.aarch64.rpm"
RPM_HASH = "301ef904c1cead234088a70bd300fad124de59e23cbcf156929602f2938e3ad857aa8c6c1b218e035b3caa1845885a086f22f674935b7ed4090719b2c5ca9a39"

RPROVIDES:${PN} += "AppStream \
config-AppStream"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libappstream.so.4 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
