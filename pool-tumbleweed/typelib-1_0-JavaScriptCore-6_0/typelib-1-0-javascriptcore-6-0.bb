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

RPM_NAME = "typelib-1_0-JavaScriptCore-6_0-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "8bfc1ab50b3c4dce875be495ec62ee6aaea6872514d99b86379e7fa11abe9efb056ff174207eb82e837feea3b5dcaf28bed04afa8e2789c9765eb959e7f591cc"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-6-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
