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

RPM_NAME = "net-snmp-devel-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "b12524eeedb390bf63a9499197051448dd2299dbf3c951dd6936dd3dc24a18f9624127c31640f6dac4cb54be94eedc78ac18d0a563fb41b9a508eb8ec48515d4"

RPROVIDES:${PN} += "net-snmp-devel \
pkgconfig-netsnmp \
pkgconfig-netsnmp-agent"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/pkg-config \
/usr/bin/sh \
libsensors4-devel \
libsnmp40 \
perl \
perl-SNMP \
pkgconfig-libssl \
rpm-devel \
tcpd-devel \
zlib-devel"

inherit rpm
