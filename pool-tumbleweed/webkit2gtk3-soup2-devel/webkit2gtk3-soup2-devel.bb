SUMMARY = "Development files for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk3-soup2-devel-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "f80977198916b63bc6565dcae69eda4b2e52fd8cdc9c90ac2c45b6bd08898fdfb92b371761adc359be31fb341539a390e1ce4447cfc4d0a9ab8ed6987ce793f5"

RPROVIDES:${PN} += "pkgconfig-javascriptcoregtk-4.0 \
pkgconfig-webkit2gtk-4.0 \
pkgconfig-webkit2gtk-web-extension-4.0 \
webkit2gtk3-soup2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjavascriptcoregtk-4-0-18 \
libwebkit2gtk-4-0-37 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-javascriptcoregtk-4.0 \
pkgconfig-libsoup-2.4 \
typelib-1-0-JavaScriptCore-4-0 \
typelib-1-0-WebKit2-4-0 \
typelib-1-0-WebKit2WebExtension-4-0"

inherit rpm
