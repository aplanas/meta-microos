SUMMARY = "SPICE Protocol Plugin for Remmina"
DESCRIPTION = "This package provides the SPICE protocol plugin for Remmina."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-spice-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "ca94bd7a0d6925e39a7dc8bf368001be134b04b4f4fbea483d41a9c4b3a82d4d69f5b5dc90b75f0defc402a9b77ca96afad7dc6bb26fe536fff8bd1004acfb1a"

RPROVIDES:${PN} += "remmina-plugin-spice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
remmina"

inherit rpm
