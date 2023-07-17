SUMMARY = "Development files for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk3-soup2-devel-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "8d59841806f15581bd33dc7e18b8954f879d2c94be290ad929373146ee8296c953ba8f2e26ee7a3adc155d9368ccd49cce8906824a8cb540e2cc0da31125c0b2"

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
