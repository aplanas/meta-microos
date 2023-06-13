SUMMARY = "Documentation for ucblogo - a free logo interpreter"
DESCRIPTION = "This package provides additional documentation for ucblogo."
LICENSE = "GPL-3.0-or-later"

PV = "6.2.4"

RPM_NAME = "ucblogo-doc-6.2.4-1.2.noarch.rpm"
RPM_HASH = "17a2d9a3c5d6e8096c5aaf6d5f94116f994b4e32021de73921686c37b095181885d6a3e2e1d496070c716a64e1a3b9bb8b7cde6f184801da41f64a4188a9d27d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ucblogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
