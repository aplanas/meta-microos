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

RPM_NAME = "wt-4.8.1-3.8.aarch64.rpm"
RPM_HASH = "7c552f798946be5ae12dca2f8db77c44e8076bbf0dcd90291a64793cd4aa2c0f98d196dc3c78843e2925f90649f30d928b40233294534f88c975d8061049c3ce"

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
libhpdf.so.2 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
openssl"

inherit rpm
