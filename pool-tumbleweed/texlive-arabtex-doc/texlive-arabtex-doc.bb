SUMMARY = "Documentation for texlive-arabtex"
DESCRIPTION = "This package includes the documentation for texlive-arabtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.17svn64260"

RPM_NAME = "texlive-arabtex-doc-2023.201.3.17svn64260-54.1.noarch.rpm"
RPM_HASH = "d02bc1a0a7103d7d38fc6866ae110f1c39e6c7b8aecd08b489df159cc241529f133dce694d6385f565f8b2085681980acd4c0a2e8bb3c3e1d6c9a29463343006"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
