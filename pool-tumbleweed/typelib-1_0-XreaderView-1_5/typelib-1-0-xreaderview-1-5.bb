SUMMARY = "XReaderView -- Introspection Bindings"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "3.4.5"

RPM_NAME = "typelib-1_0-XreaderView-1_5-3.4.5-1.4.aarch64.rpm"
RPM_HASH = "0ec1a3bbb91531dd32bec5141b1c9e68aa11746123b796ed699390f696a66a4a41a8c4639112c5b764451b66e47d0c83abe65f358b28798449a096c145a2cec4"

RPROVIDES:${PN} += "typelib-1-0-XreaderView-1-5 \
typelib-1-0-XreaderView-1-5-0 \
typelib-XreaderView"

RDEPENDS:${PN} += "libxreaderview.so.3 \
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
typelib-XreaderDocument \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
