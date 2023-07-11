SUMMARY = "OpenLDAP Client Libraries"
DESCRIPTION = "This package contains the OpenLDAP client libraries."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "libldap2-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "f3ef203a29ac780805c5e9a89effb251fe5658e3c39108deab2a402cd41b84bf0324a26597e252a277de60a7373efd58ee8a0e9c86d0ec5874e9c2559634c3cd"

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
