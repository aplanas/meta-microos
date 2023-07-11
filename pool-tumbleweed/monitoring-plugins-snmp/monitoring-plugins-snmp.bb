SUMMARY = "SNMP monitoring"
DESCRIPTION = "The Simple Network Management Protocol (SNMP) can be used to monitor \
network-attached devices for conditions that warrant administrative attention. \
 \
This package includes the 'check_snmp' plugin for Nagios or Icinga."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-snmp-2.3.1-9.5.aarch64.rpm"
RPM_HASH = "4b9b1375f7ad415ff197b5d295cdc4f17ffec89efe6f7b4f96303a1aa19e2c61fb92a7c313a3a57f97fbdd7b426c2739a34391a424674b0456fcc0415d79ec97"

RPROVIDES:${PN} += "monitoring-plugins-snmp \
nagios-plugins-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
net-snmp"

inherit rpm
