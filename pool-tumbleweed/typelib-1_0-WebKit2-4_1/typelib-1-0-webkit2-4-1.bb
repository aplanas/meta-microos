SUMMARY = "Introspection bindings for webkit2gtk3"
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

PV = "2.40.5"

RPM_NAME = "typelib-1_0-WebKit2-4_1-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "df9b7168e1b2bed2b84b44279a7921a584e4d5c789ef9bc750aa6336c4d6ede62f870921a8d3a3ac7ce9d4f0a4c1a28989800419790a71f91a367ade54c5f4eb"

RPROVIDES:${PN} += "typelib-1-0-WebKit2-4-1 \
typelib-WebKit2"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0 \
libwebkit2gtk-4.1.so.0 \
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
