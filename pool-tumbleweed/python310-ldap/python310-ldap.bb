SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python310-ldap-3.4.3-1.8.aarch64.rpm"
RPM_HASH = "f50f3ca62d4bf33e60c7c63a4ee65f100fe49e6d70a41fda4b2f8852bc9b86edd00baf30cac30d7a31757118d357ec055abfbd9e5e437927d9584107b9e86b8b"

RPROVIDES:${PN} += "python3.10dist-python-ldap \
python310-ldap \
python3dist-python-ldap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
python-abi \
python310-pyasn1 \
python310-pyasn1-modules"

inherit rpm
