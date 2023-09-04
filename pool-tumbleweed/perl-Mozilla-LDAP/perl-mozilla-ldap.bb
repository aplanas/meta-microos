SUMMARY = "LDAP module that wraps the OpenLDAP C SDK"
DESCRIPTION = "A perl LDAP module that wraps the OpenLDAP C SDK."
LICENSE = "MPL-1.1 | GPL-2.0+ | LGPL-2.0+"

PV = "1.5.3"

RPM_NAME = "perl-Mozilla-LDAP-1.5.3-5.49.aarch64.rpm"
RPM_HASH = "5f9f638678da769f27e0afa93e7f00c1f20d5dd591350ee5ea240356f4f5023f98d6c4d773b1af5c8258e31946d17c214c6504fd907be02b1348dd1a441d5dc6"

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
