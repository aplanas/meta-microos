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

PV = "2.40.3"

RPM_NAME = "typelib-1_0-WebKit2-4_0-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "952bc082f93d275ba8ac8044f29775f48f915936eec2448fcca97f18bae7fe8428c5e9ae039ad71206e3927f93201f1109ef3d1ffb43ebc8f08a7a120973816d"

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
