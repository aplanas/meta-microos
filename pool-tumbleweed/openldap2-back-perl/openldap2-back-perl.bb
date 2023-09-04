SUMMARY = "OpenLDAP Perl Back-End"
DESCRIPTION = "The OpenLDAP Perl back-end allows you to execute Perl code specific to \
different LDAP operations."
LICENSE = "OLDAP-2.8"

PV = "2.6.4"

RPM_NAME = "openldap2-back-perl-2.6.4-2.2.aarch64.rpm"
RPM_HASH = "289390ef09ed9e0e8bbf46c4513ce8d499494116c276f407500186cbba2537c1f9a479f4e34dc1c6863cf440cba7e68acc4c6e1a46c4b0cdf13ff8f8f2c4278b"

RPROVIDES:${PN} += "openldap2-back-perl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
libperl.so \
openldap2 \
perl"

inherit rpm
