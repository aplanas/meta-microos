SUMMARY = "Documentation for texlive-pst-thick"
DESCRIPTION = "This package includes the documentation for texlive-pst-thick"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16369"

RPM_NAME = "texlive-pst-thick-doc-2023.201.1.0svn16369-53.1.noarch.rpm"
RPM_HASH = "6056a21bf0d376e5e67d2bbf4e567fbf0f69d8c42876ea31642d5a42f9a9e1962c4502179962f58479f6f225f868eb8d1ffa9859abc89ef6081b5e7c82fe97bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-thick-doc:fr) \
texlive-pst-thick-doc"
RDEPENDS:${PN} += ""

inherit rpm
