SUMMARY = "Web Toolkit"
DESCRIPTION = "Wt is a C++ library and application server for developing and \
deploying web applications. The widget-centric API is inspired by \
existing C++ GUI APIs. It offers complete abstraction of any \
web-specific implementation details.  Most importantly, the entire \
application is written in only one compiled language (C++), from which \
the library generates the necessary HTML, Javascript, CGI, and AJAX \
code."
LICENSE = "GPL-2.0-only"

PV = "4.8.1"

RPM_NAME = "wt-4.8.1-3.6.aarch64.rpm"
RPM_HASH = "786e2a9d611b82641f9252768498f670782ca7ca2194cb087ee349cd4599d632c4f3f516c2f9a91aace73379b478506af6b5bd15872e90652c167422bf5d7f96"

RPROVIDES:${PN} += "config-wt \
libwt.so.4.8.1 \
libwtfcgi.so.4.8.1 \
libwthttp.so.4.8.1 \
libwttest.so.4.8.1 \
wt"

RDEPENDS:${PN} += "/sbin/ldconfig \
FastCGI \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGraphicsMagick-Q16.so.3 \
libX11.so.6 \
libboost-filesystem.so.1.82.0 \
libboost-program-options.so.1.82.0 \
libboost-thread.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libfcgi++.so.0 \
libfcgi.so.0 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libhpdf.so \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
openssl"

inherit rpm
