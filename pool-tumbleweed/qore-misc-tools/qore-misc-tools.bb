SUMMARY = "Miscellaneous user tools writen in Qore Programming Language"
DESCRIPTION = "This package contains tool for working with: \
 - REST APIs \
 - SQL Databases"
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MIT"

PV = "1.13.0"

RPM_NAME = "qore-misc-tools-1.13.0-1.4.noarch.rpm"
RPM_HASH = "e98ee6e973ddb0229ccefc05c5fa423d8f8ca9291537b66c447cf8bde87fbd89e7b1df7c09de4ac1b1913aebaa0738eb2c96a0fe883ad2e3d468c5cab2e51e26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qore-misc-tools"
RDEPENDS:${PN} += "qore"

inherit rpm
