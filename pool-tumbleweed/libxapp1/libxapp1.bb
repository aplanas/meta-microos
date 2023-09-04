SUMMARY = "XApp library"
DESCRIPTION = "This project gathers the components which are common to multiple \
desktop environments and required to implement cross-DE solutions. \
 \
This library is used by several XApp applications."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.1"

RPM_NAME = "libxapp1-2.6.1-1.1.aarch64.rpm"
RPM_HASH = "7e9767afd4747cd92292a88f4b6a025365d27efd6bb0a7743cf1b65bf6b634a87a0273a81e6b4cd6336e8bda937976b685a0717e9bfbf537744085b809b10ed0"

RPROVIDES:${PN} += "libxapp.so.1 \
libxapp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libdbusmenu-gtk3.so.4 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
xapp-common"

inherit rpm
