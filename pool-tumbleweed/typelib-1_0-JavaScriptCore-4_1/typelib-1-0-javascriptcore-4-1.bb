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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_1-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "3f4697322709183b33fdd4136f34361e1df5344d1ddf6885250579975103d8c5d412417550b3bf338ba53903316dbbe17e7c4434ed7b92e6da60fe96685973e1"

RPROVIDES:${PN} += "typelib(JavaScriptCore) \
typelib-1_0-JavaScriptCore-4_1 \
typelib-1_0-JavaScriptCore-4_1(aarch-64)"
RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0()(64bit) \
typelib(GLib) \
typelib(GObject)"

inherit rpm
