SUMMARY = "Text-Based WWW Browser"
DESCRIPTION = "Links is like Lynx--an easy-to-use browser for HTML documents and other \
Internet services, like FTP, telnet, and news. Links provides a \
graphical interface besides the text interface. It has good support for \
frames, supports ssl, and has a little bit of JavaScript support."
LICENSE = "GPL-2.0-or-later"

PV = "2.29"

RPM_NAME = "links-2.29-1.1.aarch64.rpm"
RPM_HASH = "771007b2373aaf603c6b3d9bd1e52d2678fee165f2dc271abe6cf6cc0c74fcf1026a206fea28f50b47849720d6d8121abdccd76b7f14b068c020875a910ced30"

RPROVIDES:${PN} += "links \
links(aarch-64) \
web_browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libbrotlidec.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libevent-2.1.so.7()(64bit) \
libgomp.so.1()(64bit) \
libgpm.so.2()(64bit) \
libjpeg.so.8()(64bit) \
liblzma.so.5()(64bit) \
libm.so.6()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libssl.so.3()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libz.so.1()(64bit) \
libzstd.so.1()(64bit)"

inherit rpm
