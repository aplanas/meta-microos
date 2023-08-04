SUMMARY = "A DLZ module which stores zone data in an LDAP directory"
DESCRIPTION = "This package provides the externally loadable ldap DLZ module, without \
update support"
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-modules-ldap-9.18.17-1.2.aarch64.rpm"
RPM_HASH = "31ec2195bc95e8a286c3db44e9db0422ab28d088e21fb23d7b0184ee25766931a821f8dbaa2ef85cd8a805bbc598e41133536d920c3b081161d6acee3706c110"

RPROVIDES:${PN} += "bind-modules-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
