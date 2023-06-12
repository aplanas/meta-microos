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

PV = "2.40.2"

RPM_NAME = "typelib-1_0-WebKit-6_0-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "8b554778f5ce5b1a02b99413e1d8c7ec618beb75577a12540fd87627cdee1894d494e6054d3ed8a159c9962aff4f74d60cc306edf6fe692deea128880c68b95b"

RPROVIDES:${PN} += "typelib(WebKit) \
typelib-1_0-WebKit-6_0 \
typelib-1_0-WebKit-6_0(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1()(64bit) \
libwebkitgtk-6.0.so.4()(64bit) \
typelib(GLib) \
typelib(GModule) \
typelib(GObject) \
typelib(Gdk) \
typelib(GdkPixbuf) \
typelib(Gio) \
typelib(Graphene) \
typelib(Gsk) \
typelib(Gtk) \
typelib(HarfBuzz) \
typelib(JavaScriptCore) \
typelib(Pango) \
typelib(PangoCairo) \
typelib(Soup) \
typelib(cairo) \
typelib(freetype2)"

inherit rpm
