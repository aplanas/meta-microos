SUMMARY = "LDAP module that wraps the OpenLDAP C SDK"
DESCRIPTION = "A perl LDAP module that wraps the OpenLDAP C SDK."
LICENSE = "MPL-1.1 | GPL-2.0+ | LGPL-2.0+"

PV = "1.5.3"

RPM_NAME = "perl-Mozilla-LDAP-1.5.3-5.47.aarch64.rpm"
RPM_HASH = "71abf531fce15d33ee204508ce0cd8839122e5beff1080c10c2b262c30e88e2ae3a9adfbb7c31cc3edc593549c4e0a8d3fc1e4939bcc054bcc35c714c48a47cc"

RPROVIDES:${PN} += "perl-Mozilla--LDAP--API \
perl-Mozilla--LDAP--Conn \
perl-Mozilla--LDAP--Entry \
perl-Mozilla--LDAP--LDIF \
perl-Mozilla--LDAP--Utils \
perl-Mozilla-LDAP \
perl-SearchIter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
perl-base"

inherit rpm
