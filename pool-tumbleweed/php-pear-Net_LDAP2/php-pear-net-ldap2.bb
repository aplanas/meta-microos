SUMMARY = "Object oriented interface for searching and manipulating LDAP-entries"
DESCRIPTION = "Net_LDAP2 is the successor of Net_LDAP which is a clone of Perls Net::LDAPobject interface to directory servers. \
It does contain most of Net::LDAP's features but has some own too. \
With Net_LDAP2 you have: \
 * A simple object-oriented interface to connections, searches entries and filters. \
 * Support for tls and ldap v3. \
 * Simple modification, deletion and creation of ldap entries. \
 * Support for schema handling. \
 \
Net_LDAP2 layers itself on top of PHP's existing ldap extensions."
LICENSE = "LGPL-3.0-only"

PV = "2.2.0"

RPM_NAME = "php-pear-Net_LDAP2-2.2.0-1.12.noarch.rpm"
RPM_HASH = "3b8c1d6d64442430d218c90cfdfe1909a7687e299e2cfd25296e7a58cae26380e1229e18bd828915f96abbccb57437d91d08f2520856596610e7dc4b807c30d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "php-pear(Net_LDAP2) \
php-pear-Net_LDAP2 \
php5-pear-Net_LDAP2 \
php7-pear-Net_LDAP2"

RDEPENDS:${PN} += "/bin/sh \
php-ldap \
php-pear"

inherit rpm
