SUMMARY = "Shared library for NetworkManager-applet. Gtk4 version"
DESCRIPTION = "Shared library for NetworkManager-applet. Gtk4 version."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-0-1.10.6-1.4.aarch64.rpm"
RPM_HASH = "a7ff5ec7612ae5bfc7078d4275c467b74e7e14abfd8f2d78739526aa2fa8e7be51e4da9374c4b6ef4c1691fe5ffbc43c1cc25fc741e7a3e67c90604bb6ab3530"

RPROVIDES:${PN} += "libnma-gtk4-0 \
libnma-gtk4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgck-2.so.2 \
libgcr-4.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libnm.so.0 \
mobile-broadband-provider-info"

inherit rpm
