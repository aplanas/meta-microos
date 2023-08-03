SUMMARY = "Documentation for texlive-basque-date"
DESCRIPTION = "This package includes the documentation for texlive-basque-date"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn26477"

RPM_NAME = "texlive-basque-date-doc-2023.209.1.05svn26477-54.1.noarch.rpm"
RPM_HASH = "ee6b18aa3393a2ec9233759eecd7c9984ae6a14a62ffcda17d627e76d9a98e146bcc240e4c164bb1f15161d47d0a684380ef0494b4bab0c81a0dcb97f79ce6c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-basque-date-doc"

RDEPENDS:${PN} += ""

inherit rpm
