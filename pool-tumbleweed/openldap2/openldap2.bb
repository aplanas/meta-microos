SUMMARY = "An open source implementation of the Lightweight Directory Access Protocol"
DESCRIPTION = "OpenLDAP is a client and server reference implementation of the \
Lightweight Directory Access Protocol v3 (LDAPv3). \
 \
The server provides several database backends and overlays."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-2.6.4-1.1.aarch64.rpm"
RPM_HASH = "46c96d287291fad25f2eadd3ab11211751548fab72224fe7c3c1ff16770cd539c109514e820b5045c53789c5ffd6ddc3cb94502c2aba8f05c63dbd7c2d55e389"

RPROVIDES:${PN} += "config(openldap2) \
group(ldap) \
openldap2 \
openldap2(aarch-64) \
user(ldap)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/awk \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libldap2 \
libltdl.so.7()(64bit) \
libsasl2.so.3()(64bit) \
libslp.so.1()(64bit) \
sysuser-shadow"

inherit rpm
