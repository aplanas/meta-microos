SUMMARY = "C-Sharp Language Bindings for GTK+"
DESCRIPTION = "This package contains C-Sharp bindings for Gtk+, Gdk, Atk, and Pango. \
for use with Mono."
LICENSE = "GPL-2.0-only"

PV = "2.99.4"

RPM_NAME = "gtk-sharp3-2.99.4-6.11.aarch64.rpm"
RPM_HASH = "1b46e8c2ae8eacd9ccd4dffb0a5d0e3e1e0a0e07d197d6fd1ff22fa9c10d5d675943b90e8feb175ec3da9c2846c8d9ed585202bf42d6b1e7c6942e1cb97b37a7"

RPROVIDES:${PN} += "gtk-sharp3 \
gtk-sharp3(aarch-64) \
libatksharpglue-3.so()(64bit) \
libgiosharpglue-3.so()(64bit) \
libgtksharpglue-3.so()(64bit) \
libpangosharpglue-3.so()(64bit) \
mono(atk-sharp) \
mono(cairo-sharp) \
mono(gdk-sharp) \
mono(gtk-dotnet) \
mono(gtk-sharp) \
mono(pango-sharp)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
mono(System.Drawing) \
mono(gio-sharp) \
mono(glib-sharp) \
mono(mscorlib) \
mono-core"

inherit rpm
