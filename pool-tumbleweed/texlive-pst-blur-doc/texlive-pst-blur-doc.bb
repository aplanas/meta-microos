SUMMARY = "Documentation for texlive-pst-blur"
DESCRIPTION = "This package includes the documentation for texlive-pst-blur"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn15878"

RPM_NAME = "texlive-pst-blur-doc-2023.201.2.0svn15878-52.1.noarch.rpm"
RPM_HASH = "c5ccf105e9f86d4cb7a345c95c2c2458975c43276e18680fe52819314b0326923a58fa42d9a3007896f07295f9a332633166c09729ac3b0ab9ef1dc1a4c2cd96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-blur-doc"

RDEPENDS:${PN} += ""

inherit rpm
