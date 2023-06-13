SUMMARY = "Development files from net-snmp"
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
This package holds the development headers, libraries and API documentation \
from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "net-snmp-devel-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "9db86c8d6afe1876440e9fe483c84888851cf25a7d0d044c76dcd7bf3bff7d9c48062b1333d3983780e86c0abcc16e00bb741eefef5ba148bd58d6533cfeda7d"

RPROVIDES:${PN} += "net-snmp-devel \
net-snmp-devel(aarch-64) \
pkgconfig(netsnmp) \
pkgconfig(netsnmp-agent)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
/usr/bin/pkg-config \
libsensors4-devel \
libsnmp40 \
perl \
perl-SNMP \
pkgconfig(libssl) \
rpm-devel \
tcpd-devel \
zlib-devel"

inherit rpm
