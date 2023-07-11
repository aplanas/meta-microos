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

RPM_NAME = "setools-console-4.4.2-1.2.aarch64.rpm"
RPM_HASH = "409f09901116227b7e1792eb81ee9aefca9ca16e3ab475ba5e60a8a4fae768d3f2ad9d27058f9e8443b6af62761f305edd3c55528de54c7ffb4d51e97c5f4176"

RPROVIDES:${PN} += "setools-console"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-setools"

inherit rpm
