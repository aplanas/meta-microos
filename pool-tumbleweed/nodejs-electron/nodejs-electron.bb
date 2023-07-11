SUMMARY = "Build cross platform desktop apps with JavaScript, HTML, and CSS"
DESCRIPTION = "Nodejs application: Build cross platform desktop apps with JavaScript, HTML, and CSS"
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.14"

RPM_NAME = "nodejs-electron-22.3.14-1.1.aarch64.rpm"
RPM_HASH = "884648e08b048ffd8ef04715891eb627a3ac564806b6de9b12c1cc4faf3557c4a15dc3eb4bc3063046335b00a37cf01973c8af67d60fff1285d98f8d22fed9ca"

RPROVIDES:${PN} += "electron \
electron-abi \
nodejs-electron \
nodejs-electron-prebuilt"

RDEPENDS:${PN} += "/usr/bin/bash \
google-roboto-fonts \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libLLVM.so.16 \
libSPIRV-Tools-2023.3~rc1.so \
libSPIRV-Tools-opt-2023.3~rc1.so \
libX11.so.6 \
libXNVCtrl.so.0 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libabsl-hash.so.2301.0.0 \
libabsl-int128.so.2301.0.0 \
libabsl-raw-hash-set.so.2301.0.0 \
libabsl-raw-logging-internal.so.2301.0.0 \
libabsl-status.so.2301.0.0 \
libabsl-statusor.so.2301.0.0 \
libabsl-str-format-internal.so.2301.0.0 \
libabsl-strings.so.2301.0.0 \
libabsl-synchronization.so.2301.0.0 \
libabsl-throw-delegate.so.2301.0.0 \
libaom.so.3 \
libasound.so.2 \
libatk-1.0.so.0 \
libatk-bridge-2.0.so.0 \
libatspi.so.0 \
libavcodec.so.60 \
libavformat.so.60 \
libavif.so.15 \
libavutil.so.58 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libbsd.so.0 \
libc.so.6 \
libcairo.so.2 \
libcares.so.2 \
libcrc32c.so.1 \
libdav1d.so.6 \
libdbus-1.so.3 \
libdouble-conversion.so.3 \
libdrm.so.2 \
libevent-2.1.so.7 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libjpeg.so.8 \
libjsoncpp.so.25 \
libjxl.so.0.8 \
libm.so.6 \
libminizip.so.1 \
libnghttp2.so.14 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopus.so.0 \
libpango-1.0.so.0 \
libpipewire-0.3.so.0 \
libpng16.so.16 \
libpulse.so.0 \
libre2.so.10 \
libsmime3.so \
libsnappy.so.1 \
libstdc++.so.6 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libwoff2dec.so.1.0.2 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxml2.so.2 \
libxslt.so.1 \
libxxhash.so.0 \
libyuv.so.0 \
libz.so.1"

inherit rpm
