SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python310-ldap-3.4.3-2.1.aarch64.rpm"
RPM_HASH = "773ebadc3ba10c0dfce1af18469ee5c81c0cd2129a2dbaff7930267e6506f80c3027fab0b143a903d423e1b0a17d3951081b50f401e61ff3ab7977241aa72c7e"

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
