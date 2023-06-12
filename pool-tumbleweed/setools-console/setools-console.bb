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

RPM_NAME = "setools-console-4.4.2-1.1.aarch64.rpm"
RPM_HASH = "5f6ed258c77923d88f647a3fa2d8127e802b4b0d677810ca32c39b0d933d01b2335950a72dc5d21063a4d22f9068d67043b9b183b8333d4d9e9a8126d5674997"

RPROVIDES:${PN} += "setools-console \
setools-console(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3.10 \
python3-setools"

inherit rpm
