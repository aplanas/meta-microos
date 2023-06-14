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

RPROVIDES:${PN} += "libdocinfo.so \
libfilebrowser.so \
libmodelines.so \
libsort.so \
libspell.so \
libtaglist.so \
libtime.so \
libtrailsave.so \
pluma"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libenchant.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libgirepository-1.0.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtksourceview-4.so.0 \
libpango-1.0.so.0 \
libpeas-1.0.so.0 \
libpeas-gtk-1.0.so.0 \
libxml2.so.2 \
mate-desktop-gsettings-schemas \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-Peas \
typelib-PeasGtk \
typelib-Pluma"

inherit rpm
