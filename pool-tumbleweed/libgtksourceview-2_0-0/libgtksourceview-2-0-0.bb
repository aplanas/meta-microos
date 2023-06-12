SUMMARY = "GTK+ Source Editing Widget"
DESCRIPTION = "GtkSourceView is a text widget that extends GtkTextView, the standard \
GTK+ text widget. \
 \
It improves GtkTextView by implementing syntax highlighting and other \
features typical of a source editor."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.5"

RPM_NAME = "libgtksourceview-2_0-0-2.10.5-20.9.aarch64.rpm"
RPM_HASH = "718a36ccd6d340039648d614b5484c5e817ee93bf19162efbbde192b7277a1ebd44e2d35944c509727c21a7a18490d8c0d6965ab93a0dd2550cc85c87bb7599a"

RPROVIDES:${PN} += "gtksourceview2 \
libgtksourceview-2.0.so.0()(64bit) \
libgtksourceview-2_0-0 \
libgtksourceview-2_0-0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcairo.so.2()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.5.7)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.6)(64bit)"

inherit rpm
