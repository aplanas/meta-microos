SUMMARY = "Introspection bindings for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more. \
 \
This package provides the GObject Introspection bindings for the GTK+ \
port of WebKit2."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "typelib-1_0-WebKit2WebExtension-4_0-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "eefb09d31f921059f443e1520b82c1bff3a9ab7b8d05c1cc54b1756c6ead6f2142365155741678095b3b819586624e081353b9c3e0dc0b07c6c0d4c9c514a7ae"

RPROVIDES:${PN} += "typelib-1-0-WebKit2WebExtension-4-0 \
typelib-WebKit2WebExtension"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18 \
libwebkit2gtk-4.0.so.37 \
typelib-Atk \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-Soup \
typelib-cairo \
typelib-freetype2 \
typelib-xlib"

inherit rpm
