SUMMARY = "SNMP Agent for 389 Directory Server"
DESCRIPTION = "SNMP Agent for the 389 Directory Server base package."
LICENSE = "GPL-3.0-or-later & MPL-2.0"

PV = "2.4.0~git74.4297d88"

RPM_NAME = "389-ds-snmp-2.4.0~git74.4297d88-1.1.aarch64.rpm"
RPM_HASH = "d82abdd3f11b2ef339cac1d64315df494b14fa8951afd202c02c0648386c2be39f12bf2885c614f43b3c4784c2cbdf03455ee9d5f0c56bca10f6a99a0363100f"

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
