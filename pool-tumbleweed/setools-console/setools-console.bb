SUMMARY = "Policy analysis command-line tools for SELinux"
DESCRIPTION = "SETools is a collection of graphical tools, command-line tools, and \
libraries designed to facilitate SELinux policy analysis. \
 \
This package includes the following console tools: \
 \
  seinfo          Provide information about policies \
  sesearch        Tool to query policies \
  sedta           Domain transition analysis tool \
  seinfoflow      Information flow analysis tool \
  sediff          Semantic policy difference tool"
LICENSE = "GPL-2.0-only"

PV = "4.4.2"

RPM_NAME = "setools-console-4.4.2-2.1.aarch64.rpm"
RPM_HASH = "e391bf4c1e6a5ab12a2d273c828e2679c78ef9cf01ea5bc745db46863f2b6f60aa8cd4e62f59ee1d89382be85805d1e6fa21207c1d1be708ea9af67be639a9f9"

RPROVIDES:${PN} += "setools-console"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-setools"

inherit rpm
