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

RPM_NAME = "typelib-1_0-JavaScriptCore-6_0-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "af7cd9004f7c6df2531592afcb4e2ca4bdc072bcf39d16a071481c7ce429030582058f8c03e5ab2714a4a5fa1f2f58be3b4739ca6beae5a7b25cc0e476eb47dd"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-6-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
