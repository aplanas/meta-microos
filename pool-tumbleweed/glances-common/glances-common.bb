SUMMARY = "Service and firewalld files for glances"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface. \
 \
This packages contains the service file to start a glances server \
from systemd and a firewalld file to open the default port."
LICENSE = "LGPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "glances-common-3.3.1-2.1.noarch.rpm"
RPM_HASH = "25caccf7a1b1314632e406dc6e90abace4d982fd47770bb470e56d5d194c151a360bf15d33e9b4edbf6852de464977b17acb0159163d3ccee37e1a7c438a91c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances-common"

RDEPENDS:${PN} += "/usr/bin/sh \
glances"

inherit rpm
