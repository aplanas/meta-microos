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

PV = "2.40.5"

RPM_NAME = "typelib-1_0-WebKit2-4_0-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "4e522c3ab596fa878a612fd7836700e3cd27f68eea1925ee3de2451e33489212c17fdfb583af4160bb270e5f79a87f2b35cd66c9d3973844021cacea7567b808"

RPROVIDES:${PN} += "typelib-1-0-WebKit2-4-0 \
typelib-WebKit2"

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
