SUMMARY = "Repodata downloading library"
DESCRIPTION = "A library providing C and Python (libcURL like) API for downloading repository \
metadata."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "librepo0-1.15.1-1.6.aarch64.rpm"
RPM_HASH = "60d84a00943d99f05a069235a6485a6d018e84f7ef2253eab5777f4989eb4b09fdfd61183ccf1eff7e120f4dfd0e3546c677fd9b93f81140a487871fe82d4fa6"

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
