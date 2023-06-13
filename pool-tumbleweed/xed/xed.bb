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

RPM_NAME = "xed-3.2.8-1.3.aarch64.rpm"
RPM_HASH = "3aae80fe2042799632a0944ff07840dc6c07c78be8ea8e6b6b53b75d1efea1334b6331eb515c9b02581aa131afc8566e77e04e3bad222a98732678c0cd6ac630"

RPROVIDES:${PN} += "application() \
application(xed.desktop) \
libdocinfo.so()(64bit) \
libfilebrowser.so()(64bit) \
libmodelines.so()(64bit) \
libsort.so()(64bit) \
libspell.so()(64bit) \
libtaglist.so()(64bit) \
libtime.so()(64bit) \
libtrailsave.so()(64bit) \
libwordcompletion.so()(64bit) \
libxed.so()(64bit) \
metainfo() \
metainfo(xed.appdata.xml) \
mimehandler(text/plain) \
typelib(Xed) \
xed \
xed(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
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
libxapp.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
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
typelib(Xed) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib) \
xapps-common"

inherit rpm
