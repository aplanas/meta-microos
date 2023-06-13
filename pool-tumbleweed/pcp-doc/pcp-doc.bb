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

RPM_NAME = "pcp-doc-5.2.5-3.4.noarch.rpm"
RPM_HASH = "e936c8b36bcbb5ee65ed2f8e16ff47476949eca8646938e53e6a048b27b29315462895f6b65c6a1341dd6e7f2752098c0ab85e46756bd0fc8caba88c123fef61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-doc"

RDEPENDS:${PN} += ""

inherit rpm
