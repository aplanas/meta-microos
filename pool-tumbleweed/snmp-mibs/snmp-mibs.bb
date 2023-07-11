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

RPM_NAME = "snmp-mibs-5.9.3-4.10.aarch64.rpm"
RPM_HASH = "cbd7085503715d0345c5d989cb010651d636a2d3e1621e2cc7dde6c130c1603a7ccc363e0adae19f5856cda815020589e846d1879060fb7234eca4a5c9b39713"

RPROVIDES:${PN} += "snmp-mibs"

RDEPENDS:${PN} += ""

inherit rpm
