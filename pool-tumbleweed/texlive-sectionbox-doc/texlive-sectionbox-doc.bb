SUMMARY = "Documentation for texlive-sectionbox"
DESCRIPTION = "This package includes the documentation for texlive-sectionbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn37749"

RPM_NAME = "texlive-sectionbox-doc-2023.209.1.01svn37749-54.1.noarch.rpm"
RPM_HASH = "9e53941a91c70aed7351de08ff69dcad7ea0fce74260a751966b557c7672f0878f8f72f5b09bd9a45a34e0360281ee05c184b6fa708df9b0733c1351afd33469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sectionbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
