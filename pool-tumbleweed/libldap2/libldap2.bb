SUMMARY = "OpenLDAP Client Libraries"
DESCRIPTION = "This package contains the OpenLDAP client libraries."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldap2-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "2a7d1788515b719c756fff490c82688d226b8aa3ef842b52fb7acd9f2c667d87461a5269714a6dbc70b44805c156fa5123106c256599751abd6733632fc37f3e"

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
