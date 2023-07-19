SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-snmp-4.2.0-3.1.aarch64.rpm"
RPM_HASH = "2fc87972e0c64389bda298819027937397f5c015cc67ccd2435c3b79b17bf48b0ed83776a5420a7afba93355a2a4259fcbfebe43a177d2bf82da2e8882e2a005"

RPROVIDES:${PN} += "syslog-ng-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
