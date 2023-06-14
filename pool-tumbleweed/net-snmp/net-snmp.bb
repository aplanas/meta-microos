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

RPM_NAME = "net-snmp-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "effa79a9166a905795448c9910483fa7c978d26a6a0772d77d40f4899bd0e5df3512e747757e1505bdbfe0994298985cac00717e361cb78ea43f0711cecf5197"

RPROVIDES:${PN} += "config-net-snmp \
net-snmp"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
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
