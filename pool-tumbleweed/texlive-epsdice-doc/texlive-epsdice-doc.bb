SUMMARY = "Documentation for texlive-epsdice"
DESCRIPTION = "This package includes the documentation for texlive-epsdice"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-epsdice-doc-2023.209.2.1svn15878-54.2.noarch.rpm"
RPM_HASH = "094391e5f96c1773d9309b4cc4de97c55c320406342f4e847d7038e2165a83888817274f4e2b6dcfd53dd0bc6dcc84a50713c1805b228644a5df4691116ec850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epsdice-doc"

RDEPENDS:${PN} += ""

inherit rpm
