SUMMARY = "Gtk client and libraries for SPICE remote desktop servers"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.42"

RPM_NAME = "spice-gtk-0.42-1.3.aarch64.rpm"
RPM_HASH = "a2366e6e7d55303113cb35d17f6d31a455d361997152d7fc5872401beec6c109bcc2fb11e55c07110364af6f71d4df9c4cc1d9af4899240e64e64bc1e19c6f1d"

RPROVIDES:${PN} += "spice-gtk \
spice-gtk(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libspice-client-glib-2.0.so.8()(64bit) \
libspice-client-glib-2.0.so.8(SPICEGTK_1)(64bit) \
libspice-client-gtk-3.0.so.5()(64bit) \
libspice-client-gtk-3.0.so.5(SPICEGTK_1)(64bit) \
libwayland-server.so.0()(64bit) \
permissions"

inherit rpm
