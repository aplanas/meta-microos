SUMMARY = "FreeIPA ID mapping library"
DESCRIPTION = "A utility library for FreeIPA to map certs."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "libsss_certmap0-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "cd77e41135b7318e50fa74f3b13ee402a6da24900118e9260ae74fd64b844d3a89ed8ff872a51fd55658c2143a8ca4c34ab0d08375dba16276bc64ed4cdee381"

RPROVIDES:${PN} += "libsss-certmap.so.0 \
libsss-certmap0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libtalloc.so.2"

inherit rpm
