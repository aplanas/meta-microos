SUMMARY = "Development files for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk4-devel-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "9a6036e2fa1805a41ef586a50332638f908f8f1b08f2f74f40f893c6349b4539ae5ae983cbff0a3e669391be8d1c251319e11cdb414a45fcf499c92970e32770"

RPROVIDES:${PN} += "pkgconfig-javascriptcoregtk-6.0 \
pkgconfig-webkitgtk-6.0 \
pkgconfig-webkitgtk-web-process-extension-6.0 \
webkit2gtk4-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjavascriptcoregtk6-0-1 \
libwebkitgtk6-0-4 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk4 \
pkgconfig-javascriptcoregtk-6.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-JavaScriptCore-6-0 \
typelib-1-0-WebKit-6-0 \
typelib-1-0-WebKitWebProcessExtension-6-0"

inherit rpm
