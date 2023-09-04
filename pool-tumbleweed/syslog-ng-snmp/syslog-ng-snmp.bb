SUMMARY = "SNMP support for syslog-ng"
DESCRIPTION = "This package provides SNMP support for syslog-ng"
LICENSE = "GPL-2.0-only"

PV = "4.3.1"

RPM_NAME = "syslog-ng-snmp-4.3.1-1.2.aarch64.rpm"
RPM_HASH = "89d1c059a2730791080eedfd612cfe3c33b999bce260781096c1509bc943b569fefc870a91b2735128f14003e49aff4990058401396a4a993f11d95b309d4224"

RPROVIDES:${PN} += "syslog-ng-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsyslog-ng-4.3.so.0 \
syslog-ng"

inherit rpm
