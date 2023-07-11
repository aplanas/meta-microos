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

RPM_NAME = "net-snmp-5.9.3-4.10.aarch64.rpm"
RPM_HASH = "2c870bc5e319f81ec734ccae89aa30d6438d607bfc461f0a8b62a463654fa14b0bfd72312ae7cf753c3b664f3c7279919e871726bef948eca26ac8d761df7c5d"

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
