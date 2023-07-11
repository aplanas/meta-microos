SUMMARY = "Documentation for texlive-rank-2-roots"
DESCRIPTION = "This package includes the documentation for texlive-rank-2-roots"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-rank-2-roots-doc-2023.201.1.0svn61719-53.2.noarch.rpm"
RPM_HASH = "11c8edfc187ae392c0db656f3d99f34e204b7552bb5a1980f692d73f8c4e6b4d806f88c92cf897ebe5df86900bab2246984b6729877d5f478a73ad5cb663f050"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rank-2-roots-doc"

RDEPENDS:${PN} += ""

inherit rpm
