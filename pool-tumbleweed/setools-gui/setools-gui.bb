SUMMARY = "Policy analysis graphical tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following graphical tools: \
 \
  apol          policy analysis tool"
LICENSE = "GPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "setools-gui-4.4.2-1.2.aarch64.rpm"
RPM_HASH = "ee542624fb722bf6fafa9ce35b6c9bc11bdea269f23f482976713f2c33dabcd133cceeb6368fdba092dc899281020f588318ff760afc1b3afc427716987e9171"

RPROVIDES:${PN} += "setools-gui"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-networkx \
python3-qt5 \
python3-setools"

inherit rpm
