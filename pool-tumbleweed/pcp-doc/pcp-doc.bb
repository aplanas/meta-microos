SUMMARY = "Documentation and tutorial for the Performance Co-Pilot"
DESCRIPTION = "Documentation and tutorial for the Performance Co-Pilot \
Performance Co-Pilot (PCP) provides a framework and services to support \
system-level performance monitoring and performance management. \
 \
The pcp-doc package provides useful information on using and \
configuring the Performance Co-Pilot (PCP) toolkit for system \
level performance management.  It includes tutorials, HOWTOs, \
and other detailed documentation about the internals of core \
PCP utilities and daemons, and the PCP graphical tools."
LICENSE = "GPL-2.0+ & CC-BY-SA-3.0"

PV = "5.2.5"

RPM_NAME = "pcp-doc-5.2.5-3.8.noarch.rpm"
RPM_HASH = "6dd7e9f324032af7af8402d33f7633ca883a5a566653ec54de7a47ff338628eef0b0943851ed00f0183fd4d387178cb79982ddb501dd4e5f09836959e6f17e31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-doc"

RDEPENDS:${PN} += ""

inherit rpm
