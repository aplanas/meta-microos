SUMMARY = "Tools for Importing Microsoft Word (tm) Documents"
DESCRIPTION = "WV is a program that can understand the Microsoft Word 8 binary file \
format (Office97). It currently converts Word into HTML, which can then \
be read with a web browser."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.9"

RPM_NAME = "wv-1.2.9-2.10.aarch64.rpm"
RPM_HASH = "ed5e39e43c3910d189e80d35e990ab7619241f67ed718090bf4b9448e2a76299ae26893b061d7688b54b74e530d3021c22b59783551fb198938bea9d2d0deb73"

RPROVIDES:${PN} += "wv"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libwmf-0.2.so.7 \
libwmflite-0.2.so.7 \
libwv-1.2.so.4 \
w3m"

inherit rpm
