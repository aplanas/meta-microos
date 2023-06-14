SUMMARY = "UTF-8 text editor"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME environment. \
 \
It features a multi-document frame, syntax highlighting, autoindent \
options, autosave, and plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gedit-44.2-1.4.aarch64.rpm"
RPM_HASH = "44f5eb2db353bee3734b0f955e6e16b9d0e8a67db32834a7747a1e727a118c4d2d2c490a7ad6702e8fcf7a89d7ba989876859c8c745745edc139f109cbfe7731"

RPROVIDES:${PN} += "gedit \
gedit2 \
libdocinfo.so \
libfilebrowser.so \
libgedit-44.so \
libmodelines.so \
libquickhighlight.so \
libsort.so \
libspell.so \
libtime.so \
typelib-Gedit"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libamtk-5.so.0 \
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
libtepl-6.so.2 \
python3-cairo \
python3-gedit \
python3-gobject \
python3-gobject-cairo \
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
typelib-PeasGtk \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
