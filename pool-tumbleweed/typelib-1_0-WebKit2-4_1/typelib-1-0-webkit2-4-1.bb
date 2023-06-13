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

PV = "2.40.2"

RPM_NAME = "typelib-1_0-WebKit2-4_1-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "97dc27d63b57f9369c9d3b6f0e0b23486b90f0e183ded881610f4a37780cb9bd7380f55f9d3068d9b52f04a2ec8dfea531dc716ba65fe379534c2c2152156a19"

RPROVIDES:${PN} += "typelib(WebKit2) \
typelib-1_0-WebKit2-4_1 \
typelib-1_0-WebKit2-4_1(aarch-64)"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0()(64bit) \
libwebkit2gtk-4.1.so.0()(64bit) \
typelib(Atk) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(JavaScriptCore) \
typelib(Pango) \
typelib(Soup) \
typelib(cairo) \
typelib(freetype2) \
typelib(xlib)"

inherit rpm
