SUMMARY = "Documentation for texlive-dinat"
DESCRIPTION = "This package includes the documentation for texlive-dinat"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.5svn15878"

RPM_NAME = "texlive-dinat-doc-2023.201.2.5svn15878-52.1.noarch.rpm"
RPM_HASH = "5e5d62c694e9f657a5a1c1de28978d396eae7e8a9c15d5be6a90ab2fc46d487a22d67d0582dcc5c46503b2841e0a82ddefd9a2a32c8c8247225885fcac8e2080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dinat-doc-de \
texlive-dinat-doc"

RDEPENDS:${PN} += ""

inherit rpm
