SUMMARY = "Header files needed for sudo plugin development"
DESCRIPTION = "These header files are needed for building of sudo plugins."
LICENSE = "ISC"

PV = "1.9.14p1"

RPM_NAME = "sudo-devel-1.9.14p1-1.1.aarch64.rpm"
RPM_HASH = "eb63d14907a6b38f723913718de4a38b0e306e627934a538e68f26810094e89ae1a55db57286fd8ec944dd8edeac440cc52ad7377e1ece9518f343bfe37f679c"

RPROVIDES:${PN} += "sudo-devel"

RDEPENDS:${PN} += "sudo"

inherit rpm
