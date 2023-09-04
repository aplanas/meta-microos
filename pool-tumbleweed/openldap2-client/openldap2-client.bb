SUMMARY = "OpenLDAP client utilities"
DESCRIPTION = "OpenLDAP client utilities such as ldapadd, ldapsearch, ldapmodify."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-client-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "2ade68b392f5ef1785cf93e68afe2cb5df42bc8e393218d62f77ec6a3f85a06af3b61a8d837e65de86d1becece9b9cfdd8ab7848dce08f86beb629c28cfb319b"

RPROVIDES:${PN} += "openldap2-client"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libldap2 \
libsasl2.so.3"

inherit rpm
