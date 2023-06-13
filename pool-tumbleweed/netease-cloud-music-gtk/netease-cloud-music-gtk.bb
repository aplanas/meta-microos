SUMMARY = "Linux 平台下基于 Rust + GTK4 开发的网易云音乐播放器"
DESCRIPTION = "netease-cloud-music-gtk 是基于 Rust + GTK4 开发的网易云音乐播放器，专为 Linux 系统打造。"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "netease-cloud-music-gtk-2.2.0-1.4.aarch64.rpm"
RPM_HASH = "9a749a88faf9eaf7fc1034d2d824acd22329dcf3fceb632d556bb43aec6f0209d26d91219479523c51b28b416cf900d3b5ca08599f75eb7e45d8c80174541e85"

RPROVIDES:${PN} += "application() \
application(com.gitee.gmg137.NeteaseCloudMusicGtk4.desktop) \
metainfo() \
metainfo(com.gitee.gmg137.NeteaseCloudMusicGtk4.appdata.xml) \
netease-cloud-music-gtk \
netease-cloud-music-gtk(aarch-64)"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libadwaita-1.so.0()(64bit) \
libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo-gobject.so.2()(64bit) \
libcairo.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgraphene-1.0.so.0()(64bit) \
libgstbase-1.0.so.0()(64bit) \
libgstplay-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit) \
libgstvideo-1.0.so.0()(64bit) \
libgtk-4.so.1()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit) \
openssl"

inherit rpm
