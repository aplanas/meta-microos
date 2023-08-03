SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-snmp-4.3.1-1.1.aarch64.rpm"
RPM_HASH = "b9d5947291542e8e812ff34fe91d0b8b080653e7d83847861d9dfb4185d65a90a74e650b8565675ef4f2a3ee85759401f9154f1184ca4f4fc21142b9ca863562"

RPROVIDES:${PN} += "syslog-ng-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
