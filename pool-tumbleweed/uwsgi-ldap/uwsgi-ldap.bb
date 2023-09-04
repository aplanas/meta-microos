SUMMARY = "LDAP Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for configuring uWSGI via LDAP."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.21"

RPM_NAME = "uwsgi-ldap-2.0.21-3.2.aarch64.rpm"
RPM_HASH = "08e8687d16bd4a1804bb07254b331b3c567f24265f4aa4dcb555efa0ace66ebe9609f4541fa106d6b8f7e51186b722af2d0a2c27534303c69d0fd50d4fc98f58"

RPROVIDES:${PN} += "uwsgi-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
uwsgi"

inherit rpm
