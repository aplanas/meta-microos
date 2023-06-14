SUMMARY = "Policy analysis graphical tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following graphical tools: \
 \
  apol          policy analysis tool"
LICENSE = "GPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "setools-gui-4.4.2-1.1.aarch64.rpm"
RPM_HASH = "e5cf406b63fb1b53df8a23e3bb09d7c50fabac72d4cd65a65b11b0ab1d9fa84dd1c958075733584ba67f9699183059c007fbc74b7ec25326784e0901bfe0a47f"

RPROVIDES:${PN} += "setools-gui"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
python-abi \
python3-networkx \
python3-qt5 \
python3-setools"

inherit rpm
