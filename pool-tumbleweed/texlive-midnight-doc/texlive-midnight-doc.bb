SUMMARY = "Documentation for texlive-midnight"
DESCRIPTION = "This package includes the documentation for texlive-midnight"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-midnight-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "3bdff2d1192ffb7196d8bae78d72d4489389e899bc2e76b34733225ef671a2b676db98cd8938fe1fb278333c7fc193b4501f9883449827139febcf1b4c166f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-midnight-doc"

RDEPENDS:${PN} += ""

inherit rpm
