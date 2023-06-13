SUMMARY = "Documentation for texlive-multibbl"
DESCRIPTION = "This package includes the documentation for texlive-multibbl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-multibbl-doc-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "71880aecaeb4ae0b95c01994708125249b074715d0f65085255be046e6079d5fde0f6ad76728ad4ac1527eae6a74abdd0c1e1565f62c4966282bc74ff683c91b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multibbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
