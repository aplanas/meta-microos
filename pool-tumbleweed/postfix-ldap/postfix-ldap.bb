SUMMARY = "Postfix LDAP map support"
DESCRIPTION = "This provides support for LDAP maps in Postfix. If you plan to use LDAP \
maps with Postfix, you need this."
LICENSE = "IPL-1.0 | EPL-2.0"

PV = "3.8.0"

RPM_NAME = "postfix-ldap-3.8.0-2.2.aarch64.rpm"
RPM_HASH = "9c690cef50e595b7d9d9e067a87d9b7d33af40a6fd6cafad70ecb6d928a31beda100951a672075cc550e1208250e46f5a8baf069d31d13a57610aac9f144f3f7"

RPROVIDES:${PN} += "config(postfix-ldap) \
postfix-ldap \
postfix-ldap(aarch-64) \
postfix:/usr/lib/postfix/postfix-ldap.so"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
liblber.so.2()(64bit) \
liblber.so.2(OPENLDAP_2.200)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
postfix"

inherit rpm
