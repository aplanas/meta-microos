SUMMARY = "Shared library for NetworkManager-applet. Gtk4 version"
DESCRIPTION = "Shared library for NetworkManager-applet. Gtk4 version."
LICENSE = "GPL-2.0-or-later"

PV = "1.10.6"

RPM_NAME = "libnma-gtk4-0-1.10.6-1.3.aarch64.rpm"
RPM_HASH = "769d4fa4f9b4a43d20bd29390933603b1bcb840c7c31ad9bd8044940fc87ff5bf746d3db533e5ded35af357ce9b3e0a1ae1a96a454dc3739c74082154c6647d8"

RPROVIDES:${PN} += "libnma-gtk4-0 \
libnma-gtk4-0(aarch-64) \
libnma-gtk4.so.0()(64bit) \
libnma-gtk4.so.0(libnma_1_2_0)(64bit) \
libnma-gtk4.so.0(libnma_1_8_0)(64bit) \
libnma-gtk4.so.0(libnma_1_8_12)(64bit) \
libnma-gtk4.so.0(libnma_1_8_20)(64bit) \
libnma-gtk4.so.0(libnma_1_8_22)(64bit) \
libnma-gtk4.so.0(libnma_1_8_28)(64bit) \
libnma-gtk4.so.0(libnma_1_8_36)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgck-2.so.2()(64bit) \
libgcr-4.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libnm.so.0()(64bit) \
libnm.so.0(libnm_1_0_0)(64bit) \
libnm.so.0(libnm_1_2_0)(64bit) \
libnm.so.0(libnm_1_6_0)(64bit) \
libnm.so.0(libnm_1_8_0)(64bit) \
mobile-broadband-provider-info"

inherit rpm
