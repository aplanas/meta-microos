SUMMARY = "SNMP monitoring"
DESCRIPTION = "The Simple Network Management Protocol (SNMP) can be used to monitor \
network-attached devices for conditions that warrant administrative attention. \
 \
This package includes the 'check_snmp' plugin for Nagios or Icinga."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.3.1"

RPM_NAME = "monitoring-plugins-snmp-2.3.1-9.4.aarch64.rpm"
RPM_HASH = "9fa0480011c728a63b9d730e57257fa4c51e74a8875d094affd05365c6b552c409b0bf4957b5dda8e344ef04a61f09c46844a3f2816bd2f9696fa7e3c53dbfbd"

RPROVIDES:${PN} += "monitoring-plugins-snmp \
monitoring-plugins-snmp(aarch-64) \
nagios-plugins-snmp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
net-snmp"

inherit rpm
