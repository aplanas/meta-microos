SUMMARY = "A library providing access to LibreOffice functionality"
DESCRIPTION = "LibreOfficeKit can be used to access LibreOffice functionality \
through C/C++, without any need to use UNO."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreofficekit-7.5.4.2-1.3.aarch64.rpm"
RPM_HASH = "6d5ecea2eb806ac77b82e251636e32ed481e1c9a9a966c933d835453e7a5b0abcdb4a2f37f7b38860070f7d7f6a5d2edfae9ff5704357b38a09cf274eed2ed3f"

RPROVIDES:${PN} += "libreofficekit \
typelib-LOKDocView"

RDEPENDS:${PN} += "liblibreofficekitgtk.so \
libreoffice \
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
