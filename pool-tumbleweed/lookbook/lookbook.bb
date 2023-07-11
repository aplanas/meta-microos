SUMMARY = "Navigator for finding and browsing system icons"
DESCRIPTION = "Lookbook is a browser for system icons. Icons can be grouped by \
category or be searched by icon name. Icons are shown in different \
sizes. A code snippet to use in programs can be displayed."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "lookbook-1.2.0-1.11.aarch64.rpm"
RPM_HASH = "ad020f11359bf689fa03c5ccc6474b242525d01dfae3392f51250e37c1f6e9d5e1fb06869501d574861e30369df2c287de88725d55ac2db825f6bf6d61cb32b3"

RPROVIDES:${PN} += "lookbook"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libhandy-1.so.0"

inherit rpm
