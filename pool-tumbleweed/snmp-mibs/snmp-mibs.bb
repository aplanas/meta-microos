SUMMARY = "MIB files from net-snmp"
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
This package holds the MIB files from the net-snmp package."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "snmp-mibs-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "6476456a147fa5fa76bc5aacbc547e6e9bcf0fee4226f3202d6e779926dcdec9dee166bc056a12a2593b7fcd1bdceee2a735580c3c2a9f263af978aecd79d3a1"

RPROVIDES:${PN} += "snmp-mibs"

RDEPENDS:${PN} += ""

inherit rpm
