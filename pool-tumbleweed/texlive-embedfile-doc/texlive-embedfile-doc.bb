SUMMARY = "Documentation for texlive-embedfile"
DESCRIPTION = "This package includes the documentation for texlive-embedfile"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.12svn65528"

RPM_NAME = "texlive-embedfile-doc-2023.201.2.12svn65528-53.1.noarch.rpm"
RPM_HASH = "14c5bc1d1bada3a625c48d89b75d079cb598a4b5802e1a8946e7bd529301bf8a7dbe9d7b2fe3ee41bab4e541c1ac36a2756796a5a18df95630249f2cdcc0ae0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-embedfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
