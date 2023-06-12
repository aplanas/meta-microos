SUMMARY = "Documentation for texlive-writeongrid"
DESCRIPTION = "This package includes the documentation for texlive-writeongrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-doc-2023.201.0.0.1.2svn65700-52.1.noarch.rpm"
RPM_HASH = "f34c6be97f7b242dee8ef3493aa80074f5257b5a8f38403b7bb42e3481c0693be9ca181681a0bcd82b2d404a48d9280d7a2b1921973bab746fa3f05ccecfb33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-writeongrid-doc:fr) \
texlive-writeongrid-doc"
RDEPENDS:${PN} += ""

inherit rpm
