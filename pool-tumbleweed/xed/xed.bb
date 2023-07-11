SUMMARY = "A text editor with highlighting"
DESCRIPTION = "xed is a text editor designed for the Cinnamon desktop. It has most \
standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, printing and editing of multiple \
documents in one window. \
 \
xed is extensible through a plugin system, which currently \
includes support for spell checking, comparing files, viewing VCS \
ChangeLogs, and adjusting indentation levels."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.8"

RPM_NAME = "xed-3.2.8-1.4.aarch64.rpm"
RPM_HASH = "b0af2d2697e882e2e9c3f20b625332d2c0b98884b689667f26bc9efc8462da936fa4d3f77602914edf68c5627ed1e2caa5c45ecd85a2995bd9391417a0bf0cd5"

RPROVIDES:${PN} += "libdocinfo.so \
libfilebrowser.so \
libmodelines.so \
libsort.so \
libspell.so \
libtaglist.so \
libtime.so \
libtrailsave.so \
libwordcompletion.so \
libxed.so \
typelib-Xed \
xed"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgspell-1.so.2 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
libxapp.so.1 \
libxml2.so.2 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-HarfBuzz \
typelib-Pango \
typelib-Peas \
typelib-Xed \
typelib-cairo \
typelib-freetype2 \
typelib-xlib \
xapps-common"

inherit rpm
