SUMMARY = "Service and firewalld files for glances"
DESCRIPTION = "Glances is a cross-platform monitoring tool which presents a \
large amount of monitoring information through a curses or Web \
based interface. The information dynamically adapts depending on the \
size of the user interface. \
 \
This packages contains the service file to start a glances server \
from systemd and a firewalld file to open the default port."
LICENSE = "LGPL-3.0-only"

PV = "3.4.0.3"

RPM_NAME = "glances-common-3.4.0.3-1.1.noarch.rpm"
RPM_HASH = "98a230f30b0f1697a89d79b9167a359274367a1bc67d68908eff569ca7f21a36d87a8280b781e85519ee0a411c824e22aa516311ebebfbe22db3185b7f2bfe41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glances-common"

RDEPENDS:${PN} += "/usr/bin/sh \
glances"

inherit rpm
