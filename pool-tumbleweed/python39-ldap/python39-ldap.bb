SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python39-ldap-3.4.3-2.1.aarch64.rpm"
RPM_HASH = "ec5870d53d640858efb21c1760eb578ab376c0b275af809cabf35904bdf35bc1ff737a6698b165d040ffe4fff54dc24f0ee4efaa066ad8a5faeca13f67e59fee"

RPROVIDES:${PN} += "python3.9dist-python-ldap \
python39-ldap \
python3dist-python-ldap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblber.so.2 \
libldap.so.2 \
python-abi \
python39-pyasn1 \
python39-pyasn1-modules"

inherit rpm
