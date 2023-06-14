SUMMARY = "Dictionary Plugin for the Xfce Panel"
DESCRIPTION = "This package contains the xfce4-dict dictionary plugin for the Xfce panel."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.5"

RPM_NAME = "xfce4-panel-plugin-dict-0.8.5-1.1.aarch64.rpm"
RPM_HASH = "ab7676a9c4c05d6ed09df20e6e8b5e310c5a9ab3dfae62484e51d0fb059aae68a286933b0e91ad358cccbe8b7f99fe3bc9b5facbe6a7afa62956fc22f6f7f34d"

RPROVIDES:${PN} += "libxfce4dict.so \
xfce4-panel-plugin-dict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-dict \
xfce4-panel"

inherit rpm
