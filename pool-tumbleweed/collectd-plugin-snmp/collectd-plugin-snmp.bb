SUMMARY = "SNMP Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor devices using SNMP."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-snmp-5.12.0.134.g4cebbfc-1.4.aarch64.rpm"
RPM_HASH = "ea8f271e1f41749c606a7b15e5c0ca4b97b76708903195b8c309c1700fe054f01b2db939d0eb6611919d9123337b589a6e94030cffdfd8646022e773d5453e74"

RPROVIDES:${PN} += "collectd-plugin-snmp"

RDEPENDS:${PN} += "/usr/bin/perl \
collectd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
perl-Config--General \
perl-SNMP \
perl-Socket6"

inherit rpm
