SUMMARY = "Perl5 SNMP Extension Module"
DESCRIPTION = "The Perl5 'SNMP' Extension Module v3.1.0 for the UCD SNMPv3 library."
LICENSE = "GPL-2.0-or-later"

PV = "5.9.3"

RPM_NAME = "perl-SNMP-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "0cfd593eb479e1260f2ce715ecef3890d1916c4c0a7930d3e96b3ce2eeb42d06cd2a4695648faa65373d81e8f79b95dfb30a98ba235ff283842b6be9c81c7d0e"

RPROVIDES:${PN} += "perl-MakefileSubs \
perl-NetSNMP--ASN \
perl-NetSNMP--OID \
perl-NetSNMP--TrapReceiver \
perl-NetSNMP--agent \
perl-NetSNMP--agent--Support \
perl-NetSNMP--agent--default-store \
perl-NetSNMP--agent--netsnmp-request-infoPtr \
perl-NetSNMP--default-store \
perl-SNMP \
perl-SNMP--DEBUG-INTERNALS \
perl-SNMP--DEBUGGING \
perl-SNMP--DUMP-PACKET \
perl-SNMP--MIB \
perl-SNMP--MIB--MIB-OPTIONS \
perl-SNMP--MIB--NODE \
perl-SNMP--MIB--REPLACE-NEWER \
perl-SNMP--MIB--SAVE-DESCR \
perl-SNMP--Session \
perl-SNMP--TrapSession \
perl-SNMP--VarList \
perl-SNMP--Varbind"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnetsnmptrapd.so.40 \
net-snmp \
perl-base"

inherit rpm
