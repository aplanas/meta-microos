SUMMARY = "SNMP Agent for 389 Directory Server"
DESCRIPTION = "SNMP Agent for the 389 Directory Server base package."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git18.37ec5cd"

RPM_NAME = "389-ds-snmp-2.4.0~git18.37ec5cd-1.3.aarch64.rpm"
RPM_HASH = "7398bc53e0b1335f35290cb23b559806cb22ff924ff9e1987b78875e2f0abf0ab3b117aa3097bcc315631c191efb156da6e8e102060cf01327379d5436eb558d"

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
