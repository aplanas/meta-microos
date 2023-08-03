SUMMARY = "Documentation for texlive-sf298"
DESCRIPTION = "This package includes the documentation for texlive-sf298"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn41653"

RPM_NAME = "texlive-sf298-doc-2023.209.1.3svn41653-54.1.noarch.rpm"
RPM_HASH = "df6a2d720415d5a0c64345d6eb8ce84300fad9287c69dec4e3a9897b0f33659e96d8a484ce25d2b38ab596dc8a5eedd0256a6bbeae127a747954f1e86073cad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sf298-doc"

RDEPENDS:${PN} += ""

inherit rpm
