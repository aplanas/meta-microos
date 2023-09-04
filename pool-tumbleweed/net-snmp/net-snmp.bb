SUMMARY = "SNMP Daemon"
DESCRIPTION = "Net-SNMP is a suite of applications used to implement SNMP v1, SNMP v2c \
and SNMP v3 using both IPv4 and IPv6. The suite includes: \
 \
- An extensible agent for responding to SNMP queries including built-in \
  support for a wide range of MIB information modules \
- Command-line applications to retrieve and manipulate information from \
  SNMP-capable devices \
- A daemon application for receiving SNMP notifications \
- A library for developing new SNMP applications, with C and Perl APIs \
- A graphical MIB browser. \
 \
This package was originally based on the CMU 2.1.2.1 snmp code. It was \
renamed from cmu-snmp to ucd-snmp in 1995 and later renamed from ucd-snmp \
to net-snmp in November 2000."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "net-snmp-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "549de572f51ead9b34686572b1e2f5cdb8e5fa803ccfd218a6759282d0494252edc9ea58c29f079d4ae40038dfdd14f230ad0a4f50c153c17e39f1c81e56e2ea"

RPROVIDES:${PN} += "config-net-snmp \
net-snmp"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libncurses.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnetsnmpmibs.so.40 \
libnetsnmptrapd.so.40 \
libtinfo.so.6 \
libwrap.so.0 \
logrotate \
perl-SNMP \
perl-TermReadKey \
systemd"

inherit rpm
