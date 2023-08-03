SUMMARY = "Development files for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk3-devel-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "16d372d34f8c15adb3014d464a16d9e666a2191fffa42f064b93ef9a674f6ca68856191d0f61919da1cb02c379c7c3f158a8c86c20bc89b0e2d03c6b58e24c4c"

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
