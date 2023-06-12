SUMMARY = "Documentation for texlive-uspatent"
DESCRIPTION = "This package includes the documentation for texlive-uspatent"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27744"

RPM_NAME = "texlive-uspatent-doc-2023.201.1.0svn27744-53.1.noarch.rpm"
RPM_HASH = "aae67d5be9e1635bac2a22f772a9671d9fdc7cb84cc08854554fead55cdd3f587cb5592b714928e15fbf7bc2251e92331f2cd61c978aa49e5603dc000fca4b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uspatent-doc"
RDEPENDS:${PN} += ""

inherit rpm
