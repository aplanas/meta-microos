SUMMARY = "Files needed for building plugins for cifs-utils"
DESCRIPTION = "The SMB/CIFS protocol is a standard file sharing protocol widely deployed \
on Microsoft Windows machines. This package contains the header file \
necessary for building ID mapping plugins for cifs-utils."
LICENSE = "GPL-3.0-or-later"

PV = "7.0"

RPM_NAME = "cifs-utils-devel-7.0-2.3.aarch64.rpm"
RPM_HASH = "b32ba6bff5ed2538eaee4ded5147c3133413ec69f9291f9e27d3bd33ce2279ec2a15e53890ae5e87363055ee5d944d2e146cf78a1273c89cb67508d34862f179"

RPROVIDES:${PN} += "cifs-utils-devel \
cifs-utils-devel(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
