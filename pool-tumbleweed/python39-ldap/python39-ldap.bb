SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python39-ldap-3.4.3-1.5.aarch64.rpm"
RPM_HASH = "d9cdc636498f28e2ab75b755a5ef8e0951aa69dcfa64807cacc9ed6c9ec284e6238ec2e32b93f9d90cee5fd66ab7a6db67d3e35fad3d6de221cdee0c51a9d7f2"

RPROVIDES:${PN} += "python3.9dist-python-ldap \
python39-ldap \
python3dist-python-ldap"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
python-abi \
python39-pyasn1 \
python39-pyasn1-modules"

inherit rpm
