SUMMARY = "Documentation for texlive-xintsession"
DESCRIPTION = "This package includes the documentation for texlive-xintsession"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-doc-2023.201.0.0.4alphasvn60926-52.1.noarch.rpm"
RPM_HASH = "c57634f3c0226209b61ed2214fea18a6e49041880f32d47a8610bac7cfa38b7b2c795aac6ca8cbdc9afbb451263ee77b566b51d6630e89c54685ac0ae3b36c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xintsession-doc"
RDEPENDS:${PN} += ""

inherit rpm
