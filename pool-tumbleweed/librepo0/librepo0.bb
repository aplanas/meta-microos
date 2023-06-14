SUMMARY = "Repodata downloading library"
DESCRIPTION = "A library providing C and Python (libcURL like) API for downloading repository \
metadata."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "librepo0-1.15.1-1.4.aarch64.rpm"
RPM_HASH = "e7a4fea20ca1ad7a970205e5834da252be82ca99254287884379dece63c2c2dcd4cda163b2c36f570a51fd3d1510973a997e8ad33f2fbb9a69f45f3bd31a8fba"

RPROVIDES:${PN} += "librepo.so.0 \
librepo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libxml2.so.2 \
libzck.so.1"

inherit rpm
