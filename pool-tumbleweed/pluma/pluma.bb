SUMMARY = "Text editor for the MATE desktop"
DESCRIPTION = "Pluma is a text editor designed specifically for the MATE desktop. It \
has standard text editor functions and supports international text in \
Unicode. Advanced features include syntax highlighting and automatic \
indentation of source code, and printing and editing of multiple \
documents in one window. \
 \
Pluma is extensible through a plugin system, which currently \
includes support for spell checking, comparing files, viewing VCS \
ChangeLogs, and adjusting indentation levels."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "pluma-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "cd1ad90a59433e48443cc020c9b1b793346b746c476e5ae3acb264000ddb87cf95439e4d10b1692adc321a4125e8db310c4acdce9c2557c8cc00ab1d48ca3daf"

RPROVIDES:${PN} += "application() \
application(pluma.desktop) \
libdocinfo.so()(64bit) \
libfilebrowser.so()(64bit) \
libmodelines.so()(64bit) \
libsort.so()(64bit) \
libspell.so()(64bit) \
libtaglist.so()(64bit) \
libtime.so()(64bit) \
libtrailsave.so()(64bit) \
metainfo() \
metainfo(pluma.appdata.xml) \
mimehandler(text/plain) \
pluma \
pluma(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libICE.so.6()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libenchant.so.1()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libgirepository-1.0.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libgtksourceview-4.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpeas-1.0.so.0()(64bit) \
libpeas-gtk-1.0.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.5.0)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
mate-desktop-gsettings-schemas \
typelib(GLib) \
typelib(GObject) \
typelib(Gdk) \
typelib(Gio) \
typelib(Gtk) \
typelib(GtkSource) \
typelib(Pango) \
typelib(Peas) \
typelib(PeasGtk) \
typelib(Pluma)"

inherit rpm
