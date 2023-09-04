SUMMARY = "Shared Libraries from net-snmp"
DESCRIPTION = "Net-SNMP is a suite of applications used to implement SNMP v1, SNMP v2c \
and SNMP v3 using both IPv4 and IPv6. The suite includes: \
 \
* An extensible agent for responding to SNMP queries including built-in \
  support for a wide range of MIB information modules \
* Command-line applications to retrieve and manipulate information from \
  SNMP-capable devices \
* A daemon application for receiving SNMP notifications \
* A library for developing new SNMP applications, with C and Perl APIs \
* A graphical MIB browser. \
 \
This package holds the shared libraries from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "libsnmp40-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "34d125c63e0b714f43f618e3770b56d14d9d85bc3184cd35b7f5e5315b72f9f02c3edc847936d56b21783cda08ddde764390588f841c9794e7d693ecdc55999b"

RPROVIDES:${PN} += "libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnetsnmphelpers.so.40 \
libnetsnmpmibs.so.40 \
libnetsnmptrapd.so.40 \
libsnmp.so.40 \
libsnmp40"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libperl.so \
librpm.so.9 \
librpmio.so.9 \
libsensors.so.4 \
libssl.so.3 \
libwrap.so.0 \
perl-base \
snmp-mibs"

inherit rpm
