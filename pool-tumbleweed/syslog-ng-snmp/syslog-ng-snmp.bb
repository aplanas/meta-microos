SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-snmp-4.3.1-1.3.aarch64.rpm"
RPM_HASH = "69e598b002f4ae5e89bf06b5ce725547a17e4f5b27757daca36f8d6ee8e23c17f73b9205fc006df9de02255b5f186f5aa15d4a60d2c675b29ff4fcc86fe9d90a"

RPROVIDES:${PN} += "syslog-ng-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
