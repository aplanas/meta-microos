SUMMARY = "Policy analysis graphical tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following graphical tools: \
 \
  apol          policy analysis tool"
LICENSE = "GPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "setools-gui-4.4.2-2.1.aarch64.rpm"
RPM_HASH = "994bfa5fe1049f7f586c88fa700057691cf1209b0f199fb83878a29ad44fc281f3b3e7d865344612d66df002d4061206917edcb06976f4f5c845f48435f40c43"

RPROVIDES:${PN} += "setools-gui"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-networkx \
python3-qt5 \
python3-setools"

inherit rpm
