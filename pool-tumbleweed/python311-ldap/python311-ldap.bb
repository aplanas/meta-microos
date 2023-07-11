SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python311-ldap-3.4.3-1.8.aarch64.rpm"
RPM_HASH = "e1130eb7200470b3772fb5472bb1e4e2744d17f2958fbfb77b03187a929d03143c448f052448438e0e4bf8f936e64b509aa7ea15f43bb425480ead6d1532a9f8"

RPROVIDES:${PN} += "python3-ldap \
python3.11dist-python-ldap \
python311-ldap \
python3dist-python-ldap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
python-abi \
python311-pyasn1 \
python311-pyasn1-modules"

inherit rpm
