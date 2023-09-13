SUMMARY = "Documentation for nextcloud-desktop"
DESCRIPTION = "The Nextcloud Desktop Client is a tool to synchronise files from \
the Nextcloud Server with your computer. \
 \
This package contains the documentation."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "3.9.3"

RPM_NAME = "nextcloud-desktop-doc-3.9.3-1.1.noarch.rpm"
RPM_HASH = "06c13c589ad9aa1eacf466b5bbd58efa1cf297b435ecd009908f0632d67ed3906f3d441d1c217d88febfd7fd11b18a3796fe00ba7739fc1e6849e960a84a75ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-client-doc \
nextcloud-desktop-doc"

RDEPENDS:${PN} += ""

inherit rpm
