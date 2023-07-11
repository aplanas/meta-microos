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

RPM_NAME = "pcp-doc-5.2.5-3.7.noarch.rpm"
RPM_HASH = "013c5833a4d4889af70449aa446af9cec36a9582c912b0c467e00a488cf7b6dbdc845bcb44fa7adbae83f5a6e2d521add930b5f2c0058c1c87b45d6311f1ef9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pcp-doc"

RDEPENDS:${PN} += ""

inherit rpm
