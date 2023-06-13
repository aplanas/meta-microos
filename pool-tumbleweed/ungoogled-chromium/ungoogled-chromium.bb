SUMMARY = "Google's open source browser project"
DESCRIPTION = "Chromium is the open-source project behind Google Chrome. We invite you to join us in our effort to help build a safer, faster, and more stable way for all Internet users to experience the web, and to create a powerful platform for developing a new generation of web applications."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "113.0.5672.126"

RPM_NAME = "ungoogled-chromium-113.0.5672.126-1.1.aarch64.rpm"
RPM_HASH = "812ce55bf65ab988374511a98b96cc03ae7dd76b4ddac0a73d568034038ff2a86563ba36a609c7307d52cb2ac8e198e8f391dcd5ed9f8270e988ec90e225a375"

RPROVIDES:${PN} += "application() \
application(chromium-browser.desktop) \
chromium-based-browser \
chromium-browser \
config(ungoogled-chromium) \
metainfo() \
metainfo(chromium-browser.appdata.xml) \
mimehandler(application/pdf) \
mimehandler(application/rdf+xml) \
mimehandler(application/rss+xml) \
mimehandler(application/xhtml+xml) \
mimehandler(application/xhtml_xml) \
mimehandler(application/xml) \
mimehandler(image/gif) \
mimehandler(image/jpeg) \
mimehandler(image/png) \
mimehandler(image/webp) \
mimehandler(text/html) \
mimehandler(text/xml) \
mimehandler(x-scheme-handler/http) \
mimehandler(x-scheme-handler/https) \
ungoogled-chromium \
ungoogled-chromium(aarch-64) \
ungoogled-chromium-suid-helper \
web_browser"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
libFLAC.so.12()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libasound.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libatk-bridge-2.0.so.0()(64bit) \
libatomic.so.1()(64bit) \
libatspi.so.0()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcups.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdrm.so.2()(64bit) \
libevent-2.1.so.7()(64bit) \
libffi.so.8()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libharfbuzz-subset.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libnssutil3.so()(64bit) \
libopus.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
libre2.so.10()(64bit) \
libsmime3.so()(64bit) \
libsnappy.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
permissions \
xdg-utils"

inherit rpm
