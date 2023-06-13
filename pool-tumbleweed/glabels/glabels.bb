SUMMARY = "Label Editing and Printing Tool"
DESCRIPTION = "Labels is a powerful tool for editing and printing all kinds of labels. \
It comes with a lot of templates of standard labels."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.1"

RPM_NAME = "glabels-3.4.1-4.12.aarch64.rpm"
RPM_HASH = "f3b5d2991f8f28ac8e61de82c760410a6e9aa90ace72beae98529d9a254a879c856803904277312d2deca89aba7ac8d1b02670885470e4c4de9e9487f1579bc2"

RPROVIDES:${PN} += "application() \
application(glabels-3.0.desktop) \
glabels \
glabels(aarch-64) \
libglabels-3.0.so.8()(64bit) \
libglbarcode-3.0.so.0()(64bit) \
metainfo() \
metainfo(glabels-3.appdata.xml) \
mimehandler(application/x-glabels)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libebook-1.2.so.21()(64bit) \
libebook-contacts-1.2.so.4()(64bit) \
libedataserver-1.2.so.27()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libqrencode.so.4()(64bit) \
librsvg-2.so.2()(64bit) \
libxml2.so.2()(64bit)"

inherit rpm
