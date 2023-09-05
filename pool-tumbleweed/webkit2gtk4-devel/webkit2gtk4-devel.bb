SUMMARY = "Development files for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk4-devel-2.40.5-2.1.aarch64.rpm"
RPM_HASH = "3d66d6dbe9f358850b6b88324afde80308af92c6728fe8c3967534d520cac7e8bd99918b2d73555f131994ba240817b382de7194b6cd377e595eb1f3236fb412"

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
