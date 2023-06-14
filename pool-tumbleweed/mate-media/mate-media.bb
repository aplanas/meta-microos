SUMMARY = "MATE Desktop multimedia stack"
DESCRIPTION = "This package provides the Multimedia stack used by the MATE Desktop."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.26.1"

RPM_NAME = "mate-media-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "a630fe16bd18c41267da760ec6465952c1f7837aa8dd24fdc82e9a1bd10a2bd1a62a82359a35261e00715967a1243a9f66c820e7c35afba7cbdb7c2ca950090c"

RPROVIDES:${PN} += "mate-media"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libmatemixer.so.0 \
libpango-1.0.so.0 \
libxml2.so.2"

inherit rpm
