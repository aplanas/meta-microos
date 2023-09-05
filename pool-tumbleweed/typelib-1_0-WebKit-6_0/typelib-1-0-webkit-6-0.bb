SUMMARY = "Introspection bindings for webkit2gtk4"
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

RPM_NAME = "typelib-1_0-WebKit-6_0-2.40.5-2.1.aarch64.rpm"
RPM_HASH = "db69e77d8c48209216cac4f48f8beebe173d6212e640826fe8a6d88b9c736a2f54d299869f52644751bf36e1dbd37770281dce35b02e632afaab51e06830778b"

RPROVIDES:${PN} += "typelib-1-0-WebKit-6-0 \
typelib-WebKit"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
libwebkitgtk-6.0.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Graphene \
typelib-Gsk \
typelib-Gtk \
typelib-HarfBuzz \
typelib-JavaScriptCore \
typelib-Pango \
typelib-PangoCairo \
typelib-Soup \
typelib-cairo \
typelib-freetype2"

inherit rpm
