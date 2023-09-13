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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "9dfe87e7bd263c5650f64b42a01dbf5d7985f7a0fe311b5722cfa3d533338ae982320d156ff3f71857f121764690364d4ed4af7655f1c574b736ea5eb1922394"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18 \
typelib-GLib \
typelib-GObject"

inherit rpm
