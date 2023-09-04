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

RPM_NAME = "typelib-1_0-JavaScriptCore-4_1-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "f21b0e731c3ab3a44b049f4099ec32d0776c0b47a3fc91c0404d52c92ff295c108a24fa8de4fcac1875930b8a95788247ef3345ee1914bc3f15f6d9f6e36ad40"

RPROVIDES:${PN} += "typelib-1-0-JavaScriptCore-4-1 \
typelib-JavaScriptCore"

RDEPENDS:${PN} += "libjavascriptcoregtk-4.1.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
