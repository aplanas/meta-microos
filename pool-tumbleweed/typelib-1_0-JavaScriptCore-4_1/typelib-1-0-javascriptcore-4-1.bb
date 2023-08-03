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

PV = "2.40.4"

RPM_NAME = "typelib-1_0-JavaScriptCore-4_1-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "902eca86c90d649ff8ae601c9be4e0d29fce22701f71fea8a030b0d1af76bd2ed5a060771e154e644323acfef897a14fea194ce6efd8c17a07e1293855f9a8d5"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-1 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
