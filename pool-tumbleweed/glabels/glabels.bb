SUMMARY = "Label Editing and Printing Tool"
DESCRIPTION = "Labels is a powerful tool for editing and printing all kinds of labels. \
It comes with a lot of templates of standard labels."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "glabels-3.4.1-4.13.aarch64.rpm"
RPM_HASH = "c7eca108a547376548a9e64c2927e7fb80e263ccf32155834f18cb75d39a905a6c72889d52aed63c8562f265ad5b4a472f198d7933c00d6d0d01b38716fed012"

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
