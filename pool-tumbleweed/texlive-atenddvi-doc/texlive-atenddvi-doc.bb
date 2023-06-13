SUMMARY = "Documentation for texlive-atenddvi"
DESCRIPTION = "This package includes the documentation for texlive-atenddvi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn56922"

RPM_NAME = "texlive-atenddvi-doc-2023.201.1.5svn56922-53.1.noarch.rpm"
RPM_HASH = "e80c9fdcd0f9ad111f77c34201e499a939e6162d33df7b25f5a8d4d4707e3415c56b7b3a8b0696623457c2460a818a2ea49f61241a241bbb6abc442faaa43fed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atenddvi-doc"

RDEPENDS:${PN} += ""

inherit rpm
