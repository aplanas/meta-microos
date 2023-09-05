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

PV = "2.40.5"

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.5-2.1.aarch64.rpm"
RPM_HASH = "b184a8a36a26a2f631f260296764a4a8765ea1e454fb5caac880224afec5f30a5b714386f5e0888b7d49c9a693f6c356498ec46f25682c3b2c9d68e27af6ecff"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18 \
typelib-GLib \
typelib-GObject"

inherit rpm
