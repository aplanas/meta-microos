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

PV = "2.40.3"

RPM_NAME = "typelib-1_0-JavaScriptCore-4_1-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "1678adbe8263df48fbd299770cf93b315ca29a42949fff526b4bd6b771cd0afed2217d1020d37258008256f5683de86546b9938f5772d513451ad09ca218941e"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-1 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
