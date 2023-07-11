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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "e942d07eb88f1d65b94b63959fb4e4dcfcd8788fbdead64210db318a0c72111963e18b4c2b96cc739087fa91b45c07bd628427862ee94309faf74faaa2b82d67"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18 \
typelib-GLib \
typelib-GObject"

inherit rpm
