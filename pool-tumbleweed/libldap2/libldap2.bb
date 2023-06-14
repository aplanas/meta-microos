SUMMARY = "OpenLDAP Client Libraries"
DESCRIPTION = "This package contains the OpenLDAP client libraries."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldap2-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "5bcaac5f9553e1108d8ebead6ab892848da17da8c1a7b012f926440aa33c533d9913cdc424c33cbb906667aabb51458249ad0baa89f442e5087b8a7ff693eeb9"

RPROVIDES:${PN} += "liblber.so.2 \
libldap.so.2 \
libldap2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libsasl2.so.3 \
libssl.so.3"

inherit rpm
