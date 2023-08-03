SUMMARY = "Documentation for texlive-biblatex-gb7714-2015"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-gb7714-2015"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1ksvn64967"

RPM_NAME = "texlive-biblatex-gb7714-2015-doc-2023.209.1.1ksvn64967-54.1.noarch.rpm"
RPM_HASH = "9fab167be5dc487f6028c0ad9e4210153401808bde13f18bc4b4f3aec6d8de5260876b99d258ca4643070389b5ea1e86c195f9d744c36b9ece68144f56a28239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-gb7714-2015-doc-zh \
texlive-biblatex-gb7714-2015-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
