SUMMARY = "A Text-Based WWW Browser"
DESCRIPTION = "Lynx is an easy-to-use browser for HTML documents and other Internet \
services like FTP, telnet, and news.  Lynx is fast.  It is purely text \
based and therefore makes it possible to use WWW resources on text \
terminals."
LICENSE = "GPL-2.0-only"

PV = "2.9.0~dev.10"

RPM_NAME = "lynx-2.9.0~dev.10-1.10.aarch64.rpm"
RPM_HASH = "b44d99516924373b8caeae7bd756140950d982c05accd69ff484c4bd3b9d44cd4f3d7a3da3d352bcfc329dc2260d12c388dba71e76ad28de96b9b1023aebabcb"

RPROVIDES:${PN} += "config-lynx \
lynx \
web-browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libncursesw.so.6 \
libssl.so.3 \
libtinfo.so.6 \
libz.so.1 \
xli"

inherit rpm
