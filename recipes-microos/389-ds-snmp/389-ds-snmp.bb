SUMMARY = "SNMP Agent for 389 Directory Server"
DESCRIPTION = "SNMP Agent for the 389 Directory Server base package."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git0.87efeb2"

RPM_NAME = "389-ds-snmp-2.4.0~git0.87efeb2-1.1.aarch64.rpm"
RPM_HASH = "852499fe330daf4fbe9896ff29eb7fa0dcfdc56de76ffe21f7a03c7eb1ba1f46a7ef7f4ec29f55f0a197ec3e2944d94712537a67b44a2446b5dd0f0a75bc8b4b"

RPROVIDES:${PN} += "389-ds-snmp 389-ds-snmp(aarch-64) config(389-ds-snmp)"
RDEPENDS:${PN} += "/bin/sh 389-ds ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libldap.so.2()(64bit) libldap.so.2(OPENLDAP_2.200)(64bit) libnetsnmp.so.40()(64bit) libnetsnmpagent.so.40()(64bit) libnspr4.so()(64bit)"

inherit rpm
