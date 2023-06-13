SUMMARY = "Documentation for texlive-esindex"
DESCRIPTION = "This package includes the documentation for texlive-esindex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn52342"

RPM_NAME = "texlive-esindex-doc-2023.201.1.7svn52342-53.1.noarch.rpm"
RPM_HASH = "c7f60a64fcfa8c1a7d3a1b361474297a3c5e3029e6542129562a300fadb395b17d02a595fee82414105efd74f378bbcabfbf57859df335d2a17d32bdc26cdbd3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
