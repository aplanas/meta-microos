SUMMARY = "Library for rendering web content, WPE port"
DESCRIPTION = "WPE allows embedders to create simple and performant systems based on \
Web platform technologies. It is designed with hardware acceleration \
in mind, leveraging common 3D graphics APIs for best performance."
LICENSE = "BSD-3-Clause & LGPL-2.1"

PV = "2.40.3"

RPM_NAME = "libWPEWebKit-2_0-1-2.40.3-1.2.aarch64.rpm"
RPM_HASH = "af320979d4d03023163de3c1e00f68fd952e46f3827a05a74c429d51cd817c7a817e65149110323f2f7417ef13dd43437067938c2fa8b4fe7fa363af20a241ac"

RPROVIDES:${PN} += "libWPEWebKit-2-0-1 \
libWPEWebKit-2.0.so.1 \
libWPEWebKit-{-apiver}"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
ld-linux-aarch64.so.1 \
libWPEBackend-fdo-1.0.so.1 \
libatk-1.0.so.0 \
libavif.so.16 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libepoxy.so.0 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstallocators-1.0.so.0 \
libgstapp-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstfft-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgsttranscoder-1.0.so.0 \
libgstvideo-1.0.so.0 \
libharfbuzz-icu.so.0 \
libharfbuzz.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libpng16.so.16 \
libseccomp.so.2 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
libtasn1.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwoff2dec.so.1.0.2 \
libwpe-1.0.so.1 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
wpewebkit-2-0-injected-bundles \
xdg-dbus-proxy"

inherit rpm
