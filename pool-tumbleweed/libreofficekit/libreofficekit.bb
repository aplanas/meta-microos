SUMMARY = "A library providing access to LibreOffice functionality"
DESCRIPTION = "LibreOfficeKit can be used to access LibreOffice functionality \
through C/C++, without any need to use UNO."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreofficekit-7.6.0.3-1.1.aarch64.rpm"
RPM_HASH = "efbbd69d32bc001abf5c98cc4df0b66bcfda977af1c95804c70b2bf6e58fa71113e1d2b32965e3e76fb8a86721b93c3ee535332cc94d4de51989b422e4ae242b"

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
