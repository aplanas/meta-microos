SUMMARY = "LDAP module that wraps the OpenLDAP C SDK"
DESCRIPTION = "A perl LDAP module that wraps the OpenLDAP C SDK."
LICENSE = "MPL-1.1 | GPL-2.0+ | LGPL-2.0+"

PV = "1.5.3"

RPM_NAME = "perl-Mozilla-LDAP-1.5.3-5.48.aarch64.rpm"
RPM_HASH = "31184aa07243ba74ee648599698a7ebdf316c6242f88ac2cc2c5eca03b5ecc60ca68e70d5d2565a1e3a6daab5e79a702c9a4900b6ba9ceaeeeb25347409ac20d"

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
