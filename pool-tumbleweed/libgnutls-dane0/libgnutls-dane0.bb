SUMMARY = "DANE support for the GNU Transport Layer Security Library"
DESCRIPTION = "The GnuTLS project aims to develop a library that provides a secure \
layer over a reliable transport layer. \
This package contains the 'DANE' part of gnutls."
LICENSE = "LGPL-2.1-or-later"

PV = "3.8.1"

RPM_NAME = "libgnutls-dane0-3.8.1-1.1.aarch64.rpm"
RPM_HASH = "5121e8942b37ba2fc7227e4aef6b74376313653473a2b67554e9f96f55bb6e4371bf22b7e644069dbff2eed2ebef9eabed6fd70da94b8954f91c8c905e8184af"

RPROVIDES:${PN} += "libgnutls-dane.so.0 \
libgnutls-dane0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libunbound.so.8"

inherit rpm
