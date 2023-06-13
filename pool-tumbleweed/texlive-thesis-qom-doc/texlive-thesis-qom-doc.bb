SUMMARY = "Documentation for texlive-thesis-qom"
DESCRIPTION = "This package includes the documentation for texlive-thesis-qom"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn63524"

RPM_NAME = "texlive-thesis-qom-doc-2023.201.0.0.5svn63524-54.1.noarch.rpm"
RPM_HASH = "f0b078f50bfe3268e3b0112e46a4b4dee40ed89ab9dc186fbb40106ce252709439c58c76af2ea7085c45dc01470712bcbafe264329cb6743de63c00c4f65c690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-thesis-qom-doc:fa-ir) \
texlive-thesis-qom-doc"

RDEPENDS:${PN} += ""

inherit rpm
