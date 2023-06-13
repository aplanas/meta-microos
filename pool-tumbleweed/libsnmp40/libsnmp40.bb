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

RPM_NAME = "libsnmp40-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "9592c28ff6322f1458e066a28a1e6f6ff019f7a7ec643e5e15714e62bfdba44b847181cb1d948bb91f7d37794d1e8b108fa7dc0f8fd1158445785400a106f098"

RPROVIDES:${PN} += "libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit) \
libnetsnmphelpers.so.40()(64bit) \
libnetsnmpmibs.so.40()(64bit) \
libnetsnmptrapd.so.40()(64bit) \
libsnmp.so.40()(64bit) \
libsnmp40 \
libsnmp40(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libperl.so()(64bit) \
librpm.so.9()(64bit) \
librpmio.so.9()(64bit) \
libsensors.so.4()(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libwrap.so.0()(64bit) \
perl-base \
snmp-mibs"

inherit rpm
