SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.2.0"

RPM_NAME = "syslog-ng-snmp-4.2.0-2.2.aarch64.rpm"
RPM_HASH = "3dec891951f98e552e1a629b6bb0b18567eec45ee65cbef11fe5f0e47d850c702809079ebdd8a607a84a58364b705971030c243a1ad4053aff631412d2ee2a5f"

RPROVIDES:${PN} += "syslog-ng-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsyslog-ng-4.2.so.0 \
syslog-ng"

inherit rpm
