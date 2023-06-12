SUMMARY = "Documentation for texlive-association-matrix"
DESCRIPTION = "This package includes the documentation for texlive-association-matrix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64845"

RPM_NAME = "texlive-association-matrix-doc-2023.201.1.1svn64845-53.1.noarch.rpm"
RPM_HASH = "0c6780b58e3e0dac0c2dc903c66cd9466eabde73020b2de04e8e78b3ee5f2853956a9b190935c3a670685f88c4136edff2082e5adf21c9dfb132b7e77881976c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-association-matrix-doc"
RDEPENDS:${PN} += ""

inherit rpm
