SUMMARY = "Introspection bindings for the GTK+ port of the JavaScript Core Engine"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more. \
 \
This package provides the GObject Introspection bindings for the GTK+ \
port of the JavaScript Core engine."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "typelib-1_0-JavaScriptCore-6_0-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "0388d6bc67db94f2d9f7bc0a7030b932e587acc20a3566c5ba2d8dc7dd8520237b97225d247e51c2924700f77ba0bd18386ac70a1f4e5c8409cc0e9721350e65"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-6-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
