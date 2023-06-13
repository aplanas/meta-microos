SUMMARY = "Build cross platform desktop apps with JavaScript, HTML, and CSS"
DESCRIPTION = "Nodejs application: Build cross platform desktop apps with JavaScript, HTML, and CSS"
LICENSE = "AFL-2.0 & Apache-2.0 & blessing & BSD-2-Clause & BSD-3-Clause & BSD-Protection & BSD-Source-Code & bzip2-1.0.6 & IJG & ISC & LGPL-2.0-or-later & LGPL-2.1-or-later & MIT & MIT-CMU & MIT-open-group & (MPL-1.1 | GPL-2.0-or-later | LGPL-2.1-or-later) & MPL-2.0 & OpenSSL & SGI-B-2.0 & SUSE-Public-Domain & X11"

PV = "22.3.11"

RPM_NAME = "nodejs-electron-22.3.11-1.3.aarch64.rpm"
RPM_HASH = "141bfdfbac98edd064803974eb0e46f60535fac2badf197cc51db3f596b3e9757cb8de693f58900a6609f6b049827e06cb9cbb75b541a49d0c58e5a7fafa657d"

RPROVIDES:${PN} += "application() \
application(electron.desktop) \
electron \
electron(aarch-64)(abi) \
nodejs-electron \
nodejs-electron(aarch-64) \
nodejs-electron-prebuilt"

RDEPENDS:${PN} += "/bin/bash \
google-roboto-fonts \
hicolor-icon-theme \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libLLVM.so.16()(64bit) \
libLLVM.so.16(LLVM_16)(64bit) \
libSPIRV-Tools-2023.3~rc1.so()(64bit) \
libSPIRV-Tools-opt-2023.3~rc1.so()(64bit) \
libX11.so.6()(64bit) \
libXNVCtrl.so.0()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libabsl_hash.so.2301.0.0()(64bit) \
libabsl_int128.so.2301.0.0()(64bit) \
libabsl_raw_hash_set.so.2301.0.0()(64bit) \
libabsl_raw_logging_internal.so.2301.0.0()(64bit) \
libabsl_status.so.2301.0.0()(64bit) \
libabsl_statusor.so.2301.0.0()(64bit) \
libabsl_str_format_internal.so.2301.0.0()(64bit) \
libabsl_strings.so.2301.0.0()(64bit) \
libabsl_synchronization.so.2301.0.0()(64bit) \
libabsl_throw_delegate.so.2301.0.0()(64bit) \
libaom.so.3()(64bit) \
libasound.so.2()(64bit) \
libatk-1.0.so.0()(64bit) \
libatk-bridge-2.0.so.0()(64bit) \
libatspi.so.0()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavif.so.15()(64bit) \
libavutil.so.58()(64bit) \
libbrotlidec.so.1()(64bit) \
libbrotlienc.so.1()(64bit) \
libbsd.so.0()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcares.so.2()(64bit) \
libcrc32c.so.1()(64bit) \
libdav1d.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdouble-conversion.so.3()(64bit) \
libdrm.so.2()(64bit) \
libevent-2.1.so.7()(64bit) \
libexpat.so.1()(64bit) \
libfontconfig.so.1()(64bit) \
libfreetype.so.6()(64bit) \
libgbm.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libharfbuzz-subset.so.0()(64bit) \
libharfbuzz.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
libjsoncpp.so.25()(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libm.so.6()(64bit) \
libminizip.so.1()(64bit) \
libnghttp2.so.14()(64bit) \
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
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit) \
libwoff2dec.so.1.0.2()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxml2.so.2()(64bit) \
libxslt.so.1()(64bit) \
libxxhash.so.0()(64bit) \
libyuv.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
