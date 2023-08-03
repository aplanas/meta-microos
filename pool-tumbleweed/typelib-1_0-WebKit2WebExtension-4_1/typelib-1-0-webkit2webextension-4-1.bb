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

PV = "2.40.4"

RPM_NAME = "typelib-1_0-WebKit2WebExtension-4_1-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "907254d70dbea7a332185c7ba11bf461d7d3504b613a2aea4e0eefacae55accfd18f6fe340bb5aadaccef59fb4bcffafa3d014a03d2310e38bea13008c31009c"

RPROVIDES:${PN} += "typelib-1-0-WebKit2WebExtension-4-1 \
typelib-WebKit2WebExtension"

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
