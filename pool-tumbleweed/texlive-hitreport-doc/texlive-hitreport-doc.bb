SUMMARY = "Documentation for texlive-hitreport"
DESCRIPTION = "This package includes the documentation for texlive-hitreport"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn58357"

RPM_NAME = "texlive-hitreport-doc-2023.201.1.0.0svn58357-53.2.noarch.rpm"
RPM_HASH = "23dd9b653fda7492001eda91af44e661002ff659dd0d6f4a5d7bcaf676a6ab905cf8bc1b6bd8dd373b9133f4a96cc5e8a6562346fb3e1ab6afc6ac2c48579481"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hitreport-doc-zh \
texlive-hitreport-doc"

RDEPENDS:${PN} += ""

inherit rpm
