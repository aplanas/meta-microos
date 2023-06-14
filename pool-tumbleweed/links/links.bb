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
web-browser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libbrotlidec.so.1 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
libevent-2.1.so.7 \
libgomp.so.1 \
libgpm.so.2 \
libjpeg.so.8 \
liblzma.so.5 \
libm.so.6 \
libpng16.so.16 \
libssl.so.3 \
libtiff.so.6 \
libwebp.so.7 \
libz.so.1 \
libzstd.so.1"

inherit rpm
