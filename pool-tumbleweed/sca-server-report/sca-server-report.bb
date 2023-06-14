SUMMARY = "Supportconfig Analysis Server Report"
DESCRIPTION = "A tool that primarily analyzes the local server, but can analyze other \
supportconfigs that have been copied to the server. It uses the \
Supportconfig Analysis patterns to perform the analysis. \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.1"

RPM_NAME = "sca-server-report-1.5.1-1.5.noarch.rpm"
RPM_HASH = "7b2dd50d515c7a17c1a24a9490c2742acc134b4c2777cfe276746f28b37d3a83789d5e08d29b28f3cc1b6cc866d4a4cf0c6084077d201c6061416a34210503a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-sca-server-report \
sca-server-report"

RDEPENDS:${PN} += "/bin/bash \
python3-base \
sca-patterns-base \
w3m"

inherit rpm
