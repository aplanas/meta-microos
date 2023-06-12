SUMMARY = "Documentation for texlive-fancypar"
DESCRIPTION = "This package includes the documentation for texlive-fancypar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn58895"

RPM_NAME = "texlive-fancypar-doc-2023.201.1.3svn58895-52.1.noarch.rpm"
RPM_HASH = "115a871c4ba7caa9ab124c0c6d4c459e767419da05cc4cb592543c5ec3868eb910ca80de848311fd8443ee378880f2b982423eb8f3f72f30a15879d7483d1713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancypar-doc"
RDEPENDS:${PN} += ""

inherit rpm
