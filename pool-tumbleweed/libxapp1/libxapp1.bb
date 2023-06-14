SUMMARY = "XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "libxapp1-2.4.1-1.3.aarch64.rpm"
RPM_HASH = "31f531d8323f7cc7cfa15abe9659ccf21c1719025be8d9d8796ad18771259888ad4afc952e436c247ee1160ba2821377a68db0bca56dbb7cb8d904f91ed115e4"

RPROVIDES:${PN} += "libxapp.so.1 \
libxapp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
xapps-common"

inherit rpm
