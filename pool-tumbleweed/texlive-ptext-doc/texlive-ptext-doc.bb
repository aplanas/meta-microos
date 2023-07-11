SUMMARY = "Documentation for texlive-ptext"
DESCRIPTION = "This package includes the documentation for texlive-ptext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30171"

RPM_NAME = "texlive-ptext-doc-2023.201.1.1svn30171-53.2.noarch.rpm"
RPM_HASH = "e8121a084a698129a196cd095ea7251c0a63e5542f0e8cf0a04bac454a5577597e4dfdb346e58d38f1bb5bb4920d7ce7b150a4eee1be685fa002521886f67015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ptext-doc-fa \
texlive-ptext-doc"

RDEPENDS:${PN} += ""

inherit rpm
