SUMMARY = "Development files for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk3-devel-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "8c00f63dad887e4f92acc19e51d2cad08d8702421f2eeed99d8f10e6b78f82cf3d4381ec42b3d2b46b24ec821b48334245ff0ec7c6af161fc01c177256901ae4"

RPROVIDES:${PN} += "pkgconfig-javascriptcoregtk-4.1 \
pkgconfig-webkit2gtk-4.1 \
pkgconfig-webkit2gtk-web-extension-4.1 \
webkit2gtk3-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjavascriptcoregtk-4-1-0 \
libwebkit2gtk-4-1-0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-javascriptcoregtk-4.1 \
pkgconfig-libsoup-3.0 \
typelib-1-0-JavaScriptCore-4-1 \
typelib-1-0-WebKit2-4-1 \
typelib-1-0-WebKit2WebExtension-4-1"

inherit rpm
