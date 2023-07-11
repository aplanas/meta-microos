SUMMARY = "Test a LDAP server"
DESCRIPTION = "Monitor access to a Lightweight Directory Access Protocol (LDAP) server. \
 \
This package includes the 'check_ldap' and 'check_ldaps' plugins."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-ldap-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "4061ac56b3cf38a741abc8ea7cf71132d4d1c55805e48f1e38e445f2d5a85cfff55929e229f7763173b70821f2acbdf499361dbb51e145a4f0b227bc16ab585b"

RPROVIDES:${PN} += "monitoring-plugins-ldap \
nagios-plugins-ldap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2"

inherit rpm
