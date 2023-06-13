SUMMARY = "gdk-pixbuf loader for libopenraw"
DESCRIPTION = "libopenraw is a library that aim at decoding digital camera RAW files. \
 \
This package provides a libopenraw-based gdk-pixbuf loader."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.4"

RPM_NAME = "gdk-pixbuf-loader-libopenraw-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "8353d7da4fa2f91f0ea2e64dfb18928a088bd701ff4f96a8dc7a0ccf19bd5d4881a7512eff8ca7ef4147a1e4ef3b1c32125b7a3122ff0552fd7b5ab6f2784583"

RPROVIDES:${PN} += "gdk-pixbuf-loader-libopenraw \
gdk-pixbuf-loader-libopenraw(aarch-64) \
libopenraw_pixbuf.so()(64bit)"

RDEPENDS:${PN} += "/bin/sh \
gdk-pixbuf-query-loaders \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libopenraw.so.9()(64bit)"

inherit rpm
