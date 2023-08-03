SUMMARY = "Documentation for texlive-issuulinks"
DESCRIPTION = "This package includes the documentation for texlive-issuulinks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn25742"

RPM_NAME = "texlive-issuulinks-doc-2023.209.1.1svn25742-56.1.noarch.rpm"
RPM_HASH = "934ac4b82845f2dee69a7e7271a8769d622e712852134c8c292a04f272b1a98c34c41fb9a13f5b54e7b121ccf47be338c00bed9217c88f0eca36e78965e1e48c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-issuulinks-doc"

RDEPENDS:${PN} += ""

inherit rpm
