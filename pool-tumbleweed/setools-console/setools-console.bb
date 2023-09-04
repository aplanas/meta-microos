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

PV = "4.4.3"

RPM_NAME = "setools-console-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "3bd17879adfc3a3c586c3f8f3fe64cfb2f79d0c299af09d45eeb5da16e39827bc049c06d7979530f17212e6c0979d7dc9dc0483dc1c99bbd351ad178c3bc6803"

RPROVIDES:${PN} += "setools-console"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
python3-setools"

inherit rpm
