SUMMARY = "Multi-protocol extensible Chat Client"
DESCRIPTION = "WeeChat (Wee Enhanced Environment for Chat) is a free chat client, fast and light, designed for many operating systems. It is highly customizable and extensible with scripts. \
 \
Homepage: https://weechat.org/"
LICENSE = "GPL-3.0-or-later"

PV = "4.0.2"

RPM_NAME = "weechat-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "8d19f9cad46c9a03c1f3e4373a3a16603363f34bd3f7218e29d3ec3e2eacc4d8cd90e0418c785f74c1606b8db15c25787581af5e4f48f9aa3ac1fdb62ca67cc8"

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
