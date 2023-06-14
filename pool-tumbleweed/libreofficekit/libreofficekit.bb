SUMMARY = "A library providing access to LibreOffice functionality"
DESCRIPTION = "LibreOfficeKit can be used to access LibreOffice functionality \
through C/C++, without any need to use UNO."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreofficekit-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "8b06fe3bd4c6db761241c106823befca1e8f6505ceda8158c312148664755eb07dc2190d6c78ea8a28a31359d27d00908e2d01a26564b78e8a6e5f7c25f04229"

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
