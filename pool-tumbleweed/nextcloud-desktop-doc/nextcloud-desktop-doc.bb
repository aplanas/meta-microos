SUMMARY = "Documentation for nextcloud-desktop"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "nextcloud-desktop-doc-3.8.2-1.1.noarch.rpm"
RPM_HASH = "5d0d51b43a2684d948d43540a4829d1fee01fafa63855f5ee537fb6cfee228cb0cc2fd8f1d51e531f20fac1944568e1d77356ee300358f30045eeb370e54f014"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-client-doc \
nextcloud-desktop-doc"
RDEPENDS:${PN} += ""

inherit rpm
