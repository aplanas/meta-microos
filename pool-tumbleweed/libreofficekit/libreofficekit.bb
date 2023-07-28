SUMMARY = "A library providing access to LibreOffice functionality"
DESCRIPTION = "LibreOfficeKit can be used to access LibreOffice functionality \
through C/C++, without any need to use UNO."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreofficekit-7.5.4.2-1.5.aarch64.rpm"
RPM_HASH = "4f8aabdfbd816c3d8ee3217d446887ff95f8509838f2158a31d2ce9cede3c1da0f3488160fddfadc6d98ee9d09af5b664c26870a6361e9ebeffc19ced059a86b"

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
