SUMMARY = "Private library for Budgie Menu"
DESCRIPTION = "Private library for Budgie menu to link against."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.8+0"

RPM_NAME = "libbudgie-appindexer0-10.8+0-1.1.aarch64.rpm"
RPM_HASH = "f36e0ca314869a707c6b65b5763a6c0b15c6682b3bd6d7277e7542117fb180739d22a3df77daec7affb26660e75e5c818e1f8f42aee14f819d650a708593a734"

RPROVIDES:${PN} += "libbudgie-appindexer.so.0 \
libbudgie-appindexer0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
