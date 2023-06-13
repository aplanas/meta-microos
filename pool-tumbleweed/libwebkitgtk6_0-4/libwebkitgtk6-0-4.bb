SUMMARY = "Library for rendering web content, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "libwebkitgtk6_0-4-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "a66f4c324e87215222d73b26ed23074274a27ebbe2bb8f6b723381d8ab952a5f9410c983331f182baa9b13d9e80ea2855eb8b990c8221e30013075b0982b4b5a"

RPROVIDES:${PN} += "WebKitGTK-6.0 \
libwebkit2gtk4 \
libwebkitgtk-6.0.so.4()(64bit) \
libwebkitgtk6_0-4 \
libwebkitgtk6_0-4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
ld-linux-aarch64.so.1()(64bit) \
libWPEBackend-fdo-1.0.so.1()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libavif.so.15()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libdrm.so.2()(64bit) \
libenchant-2.so.2()(64bit) \
libepoxy.so.0()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgcrypt.so.20()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstallocators-1.0.so.0()(64bit) \
libgstapp-1.0.so.0()(64bit) \
libgstaudio-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstfft-1.0.so.0()(64bit) \
libgstgl-1.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgsttag-1.0.so.0()(64bit) \
libgsttranscoder-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libharfbuzz-icu.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libhyphen.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjavascriptcoregtk-6.0.so.1()(64bit) \
libjavascriptcoregtk6_0-1 \
libjpeg.so.8()(64bit) \
liblcms2.so.2()(64bit) \
libm.so.6()(64bit) \
libmanette-0.2.so.0()(64bit) \
libopenjp2.so.7()(64bit) \
libpango-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libseccomp.so.2()(64bit) \
libsecret-1.so.0()(64bit) \
libsoup-3.0.so.0()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libtasn1.so.6()(64bit) \
libtasn1.so.6(LIBTASN1_0_3)(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libwayland-server.so.0()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwoff2dec.so.1.0.2()(64bit) \
libwpe-1.0.so.1()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
libz.so.1()(64bit) \
webkitgtk-6_0-injected-bundles \
xdg-dbus-proxy"

inherit rpm
