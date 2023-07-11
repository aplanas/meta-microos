SUMMARY = "Introspection bindins for libgladeui"
DESCRIPTION = "Glade is a RAD tool to develop user interfaces for the Gtk+ 3 toolkit \
and the GNOME desktop environment. \
 \
This package provides the GObject Introspection bindings for the \
libgladeui library."
LICENSE = "GPL-2.0-or-later"

PV = "3.40.0"

RPM_NAME = "typelib-1_0-Gladeui-2_0-3.40.0-2.4.aarch64.rpm"
RPM_HASH = "a5e391cacc84a64e989acfc1a27041978281145de56e7a893b12c3a543dd298ec0cc5777831ff750ebcb76ed636428241227390206b5891edbcda0de4e5d012c"

RPROVIDES:${PN} += "typelib-1-0-Gladeui-2-0 \
typelib-Gladeui"

RDEPENDS:${PN} += "libgladeui-2.so.13 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
