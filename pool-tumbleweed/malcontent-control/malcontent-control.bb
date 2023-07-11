SUMMARY = "Parental Control Application"
DESCRIPTION = "Parental Control management application for Malcontent"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "malcontent-control-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "e2840f1d3f5e4f92ccd82eab4c438782a91c0892bd0bd8c0e7e5c3f8dee54f564a0832aa80249093b2efeddac008b43369c543f900cc8b4a334d9fa462bdeabc"

RPROVIDES:${PN} += "malcontent-control"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaccountsservice.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmalcontent-ui-0.so.0 \
libpolkit-gobject-1.so.0 \
malcontent"

inherit rpm
