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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_0-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "8a8a36b6da491e5b66b7f205a38380a98d6be0ec8cad782301b50ba8abe98de67d55d5d53dff2146279fa22f6943988be739e429bfb2133e2bedeee38ed6e68e"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.0.so.18 \
typelib-GLib \
typelib-GObject"

inherit rpm
