SUMMARY = "Documentation for texlive-logical-markup-utils"
DESCRIPTION = "This package includes the documentation for texlive-logical-markup-utils"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-logical-markup-utils-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "c9b7cf81191dc26bc961fda1e8a43b92fa81740ba948373afaa1be77ac9870f96cdb3e57359c814e47f5a1e3c379500db23b5b7285b9336665b897a1b0af18ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logical-markup-utils-doc"

RDEPENDS:${PN} += ""

inherit rpm
