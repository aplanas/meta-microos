SUMMARY = "Documentation for texlive-readarray"
DESCRIPTION = "This package includes the documentation for texlive-readarray"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn60540"

RPM_NAME = "texlive-readarray-doc-2023.201.3.1svn60540-53.1.noarch.rpm"
RPM_HASH = "4f7d90978496ab4738116b75731c8b0edbb2e9bdefcbdd37ad5ace3776543b2a29d2923d1de7754b90c4df9dadb3ecbb6047fdcab70cedb802e9bff929fd3eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readarray-doc"
RDEPENDS:${PN} += ""

inherit rpm
