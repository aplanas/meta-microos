SUMMARY = "SNMP Agent for 389 Directory Server"
DESCRIPTION = "SNMP Agent for the 389 Directory Server base package."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "389-ds-snmp-2.4.0~git18.37ec5cd-1.2.aarch64.rpm"
RPM_HASH = "c998a7d7d1336e7d8e8bbebcab01193ed3bd79e8d49855ef0b8fd3930d26c2b7bd0e83ebd903535853da8a5b8bb29bb2ff2e65dee81949167e938bb670f07a08"

RPROVIDES:${PN} += "389-ds-snmp \
389-ds-snmp(aarch-64) \
config(389-ds-snmp)"

RDEPENDS:${PN} += "/bin/sh \
389-ds \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libldap.so.2()(64bit) \
libldap.so.2(OPENLDAP_2.200)(64bit) \
libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit) \
libnspr4.so()(64bit)"

inherit rpm
