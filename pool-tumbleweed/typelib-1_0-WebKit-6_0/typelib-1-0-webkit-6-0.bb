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

RPM_NAME = "typelib-1_0-WebKit-6_0-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "6e610223f4ca3c0d23f5ca8c443bdea51132ceea654699da0edd91b678e2682704e6d3d527fa76bc41f1221cb2063b80293f227cb43ca33ed6353e068f114e16"

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
