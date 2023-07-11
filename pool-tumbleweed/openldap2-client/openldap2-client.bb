SUMMARY = "OpenLDAP client utilities"
DESCRIPTION = "OpenLDAP client utilities such as ldapadd, ldapsearch, ldapmodify."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-client-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "18cbcd428fda9de241de85a1dd5d8f93dde4a683d3ac873a3fe66cbf74e70aa28d04435c30521b363285959072c87b447b1f50d8a15ad5d055287ed6fd14ba5b"

RPROVIDES:${PN} += "openldap2-client"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libldap2 \
libsasl2.so.3"

inherit rpm
