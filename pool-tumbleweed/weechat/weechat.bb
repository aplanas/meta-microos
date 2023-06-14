SUMMARY = "Multi-protocol extensible Chat Client"
DESCRIPTION = "WeeChat (Wee Enhanced Environment for Chat) is a free chat client, fast and light, designed for many operating systems. It is highly customizable and extensible with scripts. \
 \
Homepage: https://weechat.org/"
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-3.8-1.1.aarch64.rpm"
RPM_HASH = "943c0b5276e08b00f28755118c95cda7a974bd7fa94202f257ded5271f59dccec4ca1bb5973f9f366fbbe93543850cc5ec946403678b337c574c9af6a564c579"

RPROVIDES:${PN} += "weechat"

RDEPENDS:${PN} += "ca-certificates \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libgnutls.so.30 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
