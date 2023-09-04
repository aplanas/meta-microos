SUMMARY = "Supportconfig Analysis Server Report"
DESCRIPTION = "A tool that primarily analyzes the local server, but can analyze other \
supportconfigs that have been copied to the server. It uses the \
Supportconfig Analysis patterns to perform the analysis. \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.2"

RPM_NAME = "sca-server-report-1.5.2-1.1.noarch.rpm"
RPM_HASH = "1118d17fe39afd203c6de09662f31e630c62ee7760db9f009c8d17bb117b144c770c795153f6174222573efd5266a9e9b95419cf22ce11c52b08148773001340"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sca-server-report \
sca-server-report"

RDEPENDS:${PN} += "/usr/bin/bash \
python3-base \
sca-patterns-base"

inherit rpm
