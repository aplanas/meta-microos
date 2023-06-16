SUMMARY = "An open source implementation of the Lightweight Directory Access Protocol"
DESCRIPTION = "OpenLDAP is a client and server reference implementation of the \
Lightweight Directory Access Protocol v3 (LDAPv3). \
 \
The server provides several database backends and overlays."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "46c96d287291fad25f2eadd3ab11211751548fab72224fe7c3c1ff16770cd539c109514e820b5045c53789c5ffd6ddc3cb94502c2aba8f05c63dbd7c2d55e389"

RPROVIDES:${PN} += "config-openldap2 \
group-ldap \
openldap2 \
user-ldap"

RDEPENDS:${PN} += "/usr/bin/awk \
/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
liblber.so.2 \
libldap.so.2 \
libldap2 \
libltdl.so.7 \
libsasl2.so.3 \
libslp.so.1 \
sysuser-shadow"

inherit rpm
