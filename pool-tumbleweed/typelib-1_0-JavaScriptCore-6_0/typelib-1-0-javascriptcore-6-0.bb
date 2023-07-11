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

RPM_NAME = "typelib-1_0-JavaScriptCore-6_0-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "be3f9a9041a7ad3790ff782169d3c12ee688b665431d26af3a5e1590894fedb315d58c5f16f8885f183a8ecd61449863d6768dc3ccfd179df8940cc307f9eaad"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-6-0 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-6.0.so.1 \
typelib-GLib \
typelib-GObject"

inherit rpm
