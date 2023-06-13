SUMMARY = "Python LDAP interface"
DESCRIPTION = "python-ldap provides an object-oriented API to access LDAP directory \
servers from Python programs.  Mainly it wraps the OpenLDAP 2.x libs \
for that purpose.  Additionally the package contains modules for other \
LDAP-related stuff (e.g. processing LDIF, LDAPURLs, LDAPv3 schema, etc.)."
LICENSE = "Python-2.0"

PV = "3.4.3"

RPM_NAME = "python310-ldap-3.4.3-1.5.aarch64.rpm"
RPM_HASH = "f6d30803080e199754a9a2d217a50f9be8e7886902f246946c03e1a97049a19d2a1ec8bbb641f350b85762f6c54861c492ff61ca8c807be1342ed13074d78bc7"

RPROVIDES:${PN} += "python3-ldap \
python3.10dist(python-ldap) \
python310-ldap \
python310-ldap(aarch-64) \
python3dist(python-ldap)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liblber.so.2()(64bit) \
libldap.so.2()(64bit) \
python(abi) \
python310-pyasn1 \
python310-pyasn1-modules"

inherit rpm
