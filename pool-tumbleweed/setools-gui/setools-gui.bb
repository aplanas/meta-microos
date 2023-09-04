SUMMARY = "Policy analysis graphical tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following graphical tools: \
 \
  apol          policy analysis tool"
LICENSE = "GPL-2.0-only"

PV = "4.4.3"

RPM_NAME = "setools-gui-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "0e867828840e77ddac0fd024b6dec25d2c0fa1c4ca2f6c9ec0ac4727e99390e0f176a9713dd4ce616b8b11088fc255e6fd591d6957e89b348780c90ff13036be"

RPROVIDES:${PN} += "setools-gui"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python-abi \
python3-networkx \
python3-qt5 \
python3-setools"

inherit rpm
