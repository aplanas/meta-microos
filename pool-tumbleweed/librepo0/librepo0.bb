SUMMARY = "Repodata downloading library"
DESCRIPTION = "A library providing C and Python (libcURL like) API for downloading repository \
metadata."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "librepo0-1.15.1-1.4.aarch64.rpm"
RPM_HASH = "e7a4fea20ca1ad7a970205e5834da252be82ca99254287884379dece63c2c2dcd4cda163b2c36f570a51fd3d1510973a997e8ad33f2fbb9a69f45f3bd31a8fba"

RPROVIDES:${PN} += "librepo.so.0()(64bit) \
librepo0 \
librepo0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libcurl.so.4()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgpgme.so.11()(64bit) \
libgpgme.so.11(GPGME_1.0)(64bit) \
libgpgme.so.11(GPGME_1.1)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxml2.so.2(LIBXML2_2.6.0)(64bit) \
libzck.so.1()(64bit)"

inherit rpm
