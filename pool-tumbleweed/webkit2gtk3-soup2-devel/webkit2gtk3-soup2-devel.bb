SUMMARY = "Development files for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk3-soup2-devel-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "2dad2021273871ae0db7fde40ac135a6f4418b2216635c3cd5890c73c4db02af5d73a49af9a8ba7ebe9350a166ee1d0a266e9b5c65d91109c08082d61d258cbe"

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
