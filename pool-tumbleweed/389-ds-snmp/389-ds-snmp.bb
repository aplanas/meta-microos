SUMMARY = "SNMP Agent for 389 Directory Server"
DESCRIPTION = "SNMP Agent for the 389 Directory Server base package."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "389-ds-snmp-2.4.0~git18.37ec5cd-1.2.aarch64.rpm"
RPM_HASH = "c998a7d7d1336e7d8e8bbebcab01193ed3bd79e8d49855ef0b8fd3930d26c2b7bd0e83ebd903535853da8a5b8bb29bb2ff2e65dee81949167e938bb670f07a08"

RPROVIDES:${PN} += "389-ds-snmp \
config-389-ds-snmp"

RDEPENDS:${PN} += "/usr/bin/sh \
389-ds \
ld-linux-aarch64.so.1 \
libc.so.6 \
libldap.so.2 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnspr4.so"

inherit rpm
