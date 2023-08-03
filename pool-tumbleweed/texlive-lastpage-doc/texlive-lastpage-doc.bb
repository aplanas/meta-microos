SUMMARY = "Documentation for texlive-lastpage"
DESCRIPTION = "This package includes the documentation for texlive-lastpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0asvn66461"

RPM_NAME = "texlive-lastpage-doc-2023.209.2.0asvn66461-56.1.noarch.rpm"
RPM_HASH = "faf927bebed3dabcaf9b516e926e1a76c6f4b7a3bdeff053d5e2b4b1a435895f0c19dec10230e82e7bbccb011f6b1f00e9322abf0cbb0fff366c451946791618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
