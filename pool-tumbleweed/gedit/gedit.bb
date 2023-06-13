SUMMARY = "UTF-8 text editor"
DESCRIPTION = "Gedit is a UTF-8 text editor for the GNOME environment. \
 \
It features a multi-document frame, syntax highlighting, autoindent \
options, autosave, and plugins."
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gedit-44.2-1.4.aarch64.rpm"
RPM_HASH = "44f5eb2db353bee3734b0f955e6e16b9d0e8a67db32834a7747a1e727a118c4d2d2c490a7ad6702e8fcf7a89d7ba989876859c8c745745edc139f109cbfe7731"

RPROVIDES:${PN} += "application() \
application(org.gnome.gedit.desktop) \
gedit \
gedit(aarch-64) \
gedit2 \
libdocinfo.so()(64bit) \
libfilebrowser.so()(64bit) \
libgedit-44.so()(64bit) \
libmodelines.so()(64bit) \
libquickhighlight.so()(64bit) \
libsort.so()(64bit) \
libspell.so()(64bit) \
libtime.so()(64bit) \
metainfo() \
metainfo(org.gnome.gedit.appdata.xml) \
mimehandler(application/x-awk) \
mimehandler(application/x-csh) \
mimehandler(application/x-perl) \
mimehandler(application/x-php) \
mimehandler(application/x-shellscript) \
mimehandler(text/plain) \
mimehandler(text/x-c) \
mimehandler(text/x-c++) \
mimehandler(text/x-c++hdr) \
mimehandler(text/x-c++src) \
mimehandler(text/x-chdr) \
mimehandler(text/x-csrc) \
mimehandler(text/x-fortran) \
mimehandler(text/x-java) \
mimehandler(text/x-log) \
mimehandler(text/x-makefile) \
mimehandler(text/x-moc) \
mimehandler(text/x-pascal) \
mimehandler(text/x-patch) \
mimehandler(text/x-python) \
mimehandler(text/x-readme) \
mimehandler(text/x-scheme) \
mimehandler(text/x-tcl) \
mimehandler(text/x-tex) \
typelib(Gedit)"

RDEPENDS:${PN} += "gsettings-desktop-schemas \
ld-linux-aarch64.so.1()(64bit) \
libamtk-5.so.0()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgspell-1.so.2()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libtepl-6.so.2()(64bit) \
python3-cairo \
python3-gedit \
python3-gobject \
python3-gobject-cairo \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(HarfBuzz) \
typelib(Pango) \
typelib(Peas) \
typelib(PeasGtk) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
