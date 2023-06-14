SUMMARY = "Implementation of IEEE 802.1ab (LLDP)"
DESCRIPTION = "This implementation provides LLDP sending and reception, supports VLAN \
and includes an SNMP subagent that can interface to an SNMP agent \
through AgentX protocol. \
 \
LLDP is an industry standard protocol designed to supplant proprietary \
Link-Layer protocols such as Extreme EDP (Extreme Discovery Protocol) \
and CDP (Cisco Discovery Protocol). The goal of LLDP is to provide an \
inter-vendor compatible mechanism to deliver Link-Layer notifications \
to adjacent network devices. \
 \
This daemon is also able to deal with CDP, FDP, SONMP and EDP \
protocol. It also handles LLDP-MED extension."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "1.0.17"

RPM_NAME = "lldpd-1.0.17-1.1.aarch64.rpm"
RPM_HASH = "15662c372bef9b17720f34581064235ebaf46a88b7da119941e881db92e3261073aa512b7ddf2554df22d7dcac194d8107eb69ca200ca28b6ca8148ca9495372"

RPROVIDES:${PN} += "config-lldpd \
lldpd"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libbsd.so.0 \
libc.so.6 \
libevent-2.1.so.7 \
liblldpctl.so.4 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnetsnmpmibs.so.40 \
libreadline.so.8 \
libxml2.so.2 \
pwdutils"

inherit rpm
