SUMMARY = "Label Editing and Printing Tool"
DESCRIPTION = "Labels is a powerful tool for editing and printing all kinds of labels. \
It comes with a lot of templates of standard labels."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "glabels-3.4.1-4.12.aarch64.rpm"
RPM_HASH = "f3b5d2991f8f28ac8e61de82c760410a6e9aa90ace72beae98529d9a254a879c856803904277312d2deca89aba7ac8d1b02670885470e4c4de9e9487f1579bc2"

RPROVIDES:${PN} += "glabels \
libglabels-3.0.so.8 \
libglbarcode-3.0.so.0"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libebook-1.2.so.21 \
libebook-contacts-1.2.so.4 \
libedataserver-1.2.so.27 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libqrencode.so.4 \
librsvg-2.so.2 \
libxml2.so.2"

inherit rpm
