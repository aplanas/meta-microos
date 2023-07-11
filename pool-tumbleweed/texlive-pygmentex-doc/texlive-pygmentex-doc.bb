SUMMARY = "Documentation for texlive-pygmentex"
DESCRIPTION = "This package includes the documentation for texlive-pygmentex"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn64131"

RPM_NAME = "texlive-pygmentex-doc-2023.201.0.0.11svn64131-53.2.noarch.rpm"
RPM_HASH = "5766da30a39e434fd410ab383133b11724c2790fdbe89d82a1bdd0f7e690866c5f377514469bf3ca1e4b7bb76a1856ce1f264aadb24839993a1a712bc44d5bbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pygmentex-doc"

RDEPENDS:${PN} += ""

inherit rpm
