SUMMARY = "Linux 平台下基于 Rust + GTK4 开发的网易云音乐播放器"
DESCRIPTION = "netease-cloud-music-gtk 是基于 Rust + GTK4 开发的网易云音乐播放器，专为 Linux 系统打造。"
LICENSE = "GPL-3.0-or-later"

PV = "2.2.0"

RPM_NAME = "netease-cloud-music-gtk-2.2.0-1.6.aarch64.rpm"
RPM_HASH = "2a79c0170f66e4150b612f0d939a7c948d5d23c33cdd79d9f31ac1bab810e8d9fea5c3d8f4962d7947f3ccecea679913549a8dc25ca2ce836b0b04cf48a60f91"

RPROVIDES:${PN} += "netease-cloud-music-gtk"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
gstreamer-plugins-ugly \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcrypto.so.3 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstplay-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libssl.so.3 \
libz.so.1 \
openssl"

inherit rpm
