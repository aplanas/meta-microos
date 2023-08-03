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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "dcbb6195c4a2ed162bd6242ba9759cffceabad98e8bdf0cbaea363f15e165399deed6ee01fea73f684659ec8c0a4e80446a1163d9157fdf9cf3baef036df4291"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18 \
typelib-GLib \
typelib-GObject"

inherit rpm
