SUMMARY = "Multi-protocol extensible Chat Client"
DESCRIPTION = "WeeChat (Wee Enhanced Environment for Chat) is a free chat client, fast and light, designed for many operating systems. It is highly customizable and extensible with scripts. \
 \
Homepage: https://weechat.org/"
LICENSE = "GPL-3.0-or-later"

PV = "3.8"

RPM_NAME = "weechat-3.8-1.3.aarch64.rpm"
RPM_HASH = "b157a71adbae6bbed0629232a3208b73ff9243895086d3e58ecc80b0078cdb08cf2e5e0f3dced6ba47ebc105f71fc00c9455606201c050f9f277e77a9d03f23b"

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
