SUMMARY = "Documentation for texlive-xits"
DESCRIPTION = "This package includes the documentation for texlive-xits"
LICENSE = "OFL-1.1"

PV = "2023.209.1.302svn55730"

RPM_NAME = "texlive-xits-doc-2023.209.1.302svn55730-53.1.noarch.rpm"
RPM_HASH = "8d518acb9e9b7c134f69cc69dbaf8aae599e8466a14368bf72efc5b638aadd04740352dfa5ffdf75efc9d58ab3a311e90cb49875a9f949310ceed2abe38e2220"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits-doc"

RDEPENDS:${PN} += ""

inherit rpm
