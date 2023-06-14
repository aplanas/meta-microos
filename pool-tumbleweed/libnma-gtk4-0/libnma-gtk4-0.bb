SUMMARY = "Shared library for NetworkManager-applet. Gtk4 version"
DESCRIPTION = "Shared library for NetworkManager-applet. Gtk4 version."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-0-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "769d4fa4f9b4a43d20bd29390933603b1bcb840c7c31ad9bd8044940fc87ff5bf746d3db533e5ded35af357ce9b3e0a1ae1a96a454dc3739c74082154c6647d8"

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
