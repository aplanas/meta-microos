SUMMARY = "Documentation for texlive-nimsticks"
DESCRIPTION = "This package includes the documentation for texlive-nimsticks"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.1svn64118"

RPM_NAME = "texlive-nimsticks-doc-2023.201.2.0.1svn64118-54.1.noarch.rpm"
RPM_HASH = "b46a6026d9acc2e3a4e02287bbaa9d2a0e37af94cfe034e97d5e019d64c4b5f8093e0c591d203d358e97919167075c32fd5a2e4b3625475cc51e246c8755f436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nimsticks-doc"

RDEPENDS:${PN} += ""

inherit rpm
