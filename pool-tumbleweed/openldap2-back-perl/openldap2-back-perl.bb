SUMMARY = "OpenLDAP Perl Back-End"
DESCRIPTION = "The OpenLDAP Perl back-end allows you to execute Perl code specific to \
different LDAP operations."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-perl-2.6.4-2.1.aarch64.rpm"
RPM_HASH = "011c09236b614cfcc2b6d997cac24b7c309623a0921515b098a770fffb8e33f3239d8295db0782db91947715b41b3aa943940b707fcf47e6a932b309910f1c20"

RPROVIDES:${PN} += "openldap2-back-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libperl.so \
openldap2 \
perl"

inherit rpm
