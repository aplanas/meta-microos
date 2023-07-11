SUMMARY = "LDAP Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for configuring uWSGI via LDAP."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-ldap-2.0.21-3.1.aarch64.rpm"
RPM_HASH = "cbc0d0a199399562408525a11b9cda1bbc8779730cd1631324e9610cbd0e5d00315c97f883f20b293e10ab9fa7bd93c7b8875f6f74898afa40f9ae008633b2a4"

RPROVIDES:${PN} += "uwsgi-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
uwsgi"

inherit rpm
