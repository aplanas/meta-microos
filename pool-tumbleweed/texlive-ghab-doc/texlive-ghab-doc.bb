SUMMARY = "Documentation for texlive-ghab"
DESCRIPTION = "This package includes the documentation for texlive-ghab"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn29803"

RPM_NAME = "texlive-ghab-doc-2023.201.0.0.5svn29803-52.1.noarch.rpm"
RPM_HASH = "b529001317f45a244b6213622a7ad69651275fa8ec794928a13a71821a4fe8f4d16be740b671eb38696e941b5227814cdf401e5cbb4f6c92f2580746559cd8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ghab-doc"
RDEPENDS:${PN} += ""

inherit rpm
