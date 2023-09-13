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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_1-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "7ef3fe741ff8fab1317e803226db5295ef685b61e8df6c7d7667d4870e2bc4253ebb9b6df9292f833779caa2fc515e79af6a71a0e8e1df8f1c670b0c28331223"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-1 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
