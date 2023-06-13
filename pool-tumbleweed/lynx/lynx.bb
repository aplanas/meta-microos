SUMMARY = "A Text-Based WWW Browser"
DESCRIPTION = "Lynx is an easy-to-use browser for HTML documents and other Internet \
services like FTP, telnet, and news.  Lynx is fast.  It is purely text \
based and therefore makes it possible to use WWW resources on text \
terminals."
LICENSE = "GPL-2.0-only"

PV = "2.9.0~dev.10"

RPM_NAME = "lynx-2.9.0~dev.10-1.9.aarch64.rpm"
RPM_HASH = "7c0ec3583c1a5d3ed6f0cf003b66dd1af59246e09af571e6f69be11e61357a34e321aa04c6ab6c7e0aec54626feb172dd105fbcb1581025c099f710f3ba2c44f"

RPROVIDES:${PN} += "config(lynx) \
lynx \
lynx(aarch-64) \
web_browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libncursesw.so.6()(64bit) \
libssl.so.3()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit) \
xli"

inherit rpm
