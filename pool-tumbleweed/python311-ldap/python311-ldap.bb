SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python311-ldap-3.4.3-2.1.aarch64.rpm"
RPM_HASH = "0e11326199958c363f98eb268ac1dfeb62c18bd7d0f55bdfe43a96f1d8627fea5ab896f326777b94f9cd6e80745bbe6259c9c41fd4236b4c470acb76d5cac70c"

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
