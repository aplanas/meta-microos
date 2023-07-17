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

RPM_NAME = "webkit2gtk3-devel-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "5bdbe012e3c959b7ce5e3d6af1ec69ba19e26ba35248ad3cad3a3f5fe27422011689e543e4cd296452a1c107836573783410b42f2a3bd2fbcc1b53decacc661b"

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
