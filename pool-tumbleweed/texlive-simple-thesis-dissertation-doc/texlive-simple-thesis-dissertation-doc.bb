SUMMARY = "Documentation for texlive-simple-thesis-dissertation"
DESCRIPTION = "This package includes the documentation for texlive-simple-thesis-dissertation"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn43058"

RPM_NAME = "texlive-simple-thesis-dissertation-doc-2023.209.svn43058-54.1.noarch.rpm"
RPM_HASH = "86d8433c77d4ab8b92794aca76d35aed1ae02353d2573c23f2800267bffec3cd520f403cdffed00a953f7bb43ba31f63fc46bb7568b5424b35e94366d4054d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simple-thesis-dissertation-doc"

RDEPENDS:${PN} += ""

inherit rpm
