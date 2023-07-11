SUMMARY = "Introspection bindings for the malcontent UI library"
DESCRIPTION = "Libmalcontent implements parental controls support which can be \
used by applications to filter or limit the access of child \
accounts to inappropriate content."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.10.4"

RPM_NAME = "typelib-1_0-MalcontentUi-0-0.10.4-1.6.aarch64.rpm"
RPM_HASH = "64cc5adcdb47f47bf3c7a8b54fcce9b17ef406317ab3f25fd385b92f109577a7afb7c0caac97d412c4a9934ceb509f50fd350dc811d4a644acf06f304b1f1505"

RPROVIDES:${PN} += "typelib-1-0-MalcontentUi-0 \
typelib-MalcontentUi"

RDEPENDS:${PN} += "libmalcontent-ui-0.so.0 \
typelib-AccountsService \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-Malcontent \
typelib-Pango \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
