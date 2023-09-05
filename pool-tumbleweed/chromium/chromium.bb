SUMMARY = "Google's open source browser project"
DESCRIPTION = "Chromium is the open-source project behind Google Chrome. We invite you to join us in our effort to help build a safer, faster, and more stable way for all Internet users to experience the web, and to create a powerful platform for developing a new generation of web applications."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "116.0.5845.140"

RPM_NAME = "chromium-116.0.5845.140-1.1.aarch64.rpm"
RPM_HASH = "9aab0e84e6ef8d088d486b336c794b2690418fe8d9b4c34ececef4a71e62cfeb82df2f79dd3f208d97260b2c5ff4ab9f1439a02c3b936edd1799d68fdfbb8d64"

RPROVIDES:${PN} += "chromium \
chromium-based-browser \
chromium-browser \
chromium-suid-helper \
config-chromium \
web-browser"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libFLAC.so.12 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libasound.so.2 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libatomic.so.1 \
libatspi.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libcairo.so.2 \
libcups.so.2 \
libdbus-1.so.3 \
libdrm.so.2 \
libevent-2.1.so.7 \
libexpat.so.1 \
libffi.so.8 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libjpeg.so.8 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopus.so.0 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libre2.so.11 \
libsmime3.so \
libsnappy.so.1 \
libstdc++.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxml2.so.2 \
libxslt.so.1 \
libz.so.1 \
permissions \
xdg-utils"

inherit rpm
