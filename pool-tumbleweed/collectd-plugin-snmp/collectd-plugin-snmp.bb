SUMMARY = "SNMP Monitoring Plugin for collectd"
DESCRIPTION = "Optional collectd plugin to monitor devices using SNMP."
LICENSE = "GPL-2.0-only & MIT"

PV = "5.12.0.134.g4cebbfc"

RPM_NAME = "collectd-plugin-snmp-5.12.0.134.g4cebbfc-1.6.aarch64.rpm"
RPM_HASH = "f8c899cfe02965bf9124214f1f0de65c12f659cf71ab74bb406e7d7231930d6b551e2867ef4913e315958edfc270e23f105a0b517da785c2ccd9ececa92bc87a"

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
