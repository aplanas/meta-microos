SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python311-ldap-3.4.3-1.5.aarch64.rpm"
RPM_HASH = "dfdf661bbb9f1642b1b666bb09513b6fc8b7bc1bd67ac2909e77f6207b96344d1c08f7f2c592c0398cd0300d06701c3b296dbc36b40408868ecb55a1c4e84f4e"

RPROVIDES:${PN} += "python3.11dist-python-ldap \
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
