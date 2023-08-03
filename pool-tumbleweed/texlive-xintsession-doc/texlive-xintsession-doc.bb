SUMMARY = "Documentation for texlive-xintsession"
DESCRIPTION = "This package includes the documentation for texlive-xintsession"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-doc-2023.209.0.0.4alphasvn60926-53.1.noarch.rpm"
RPM_HASH = "5b97575195a3ab4c10bb0e81438518e4772e4fead34da47813abb10236520dd026682592e7454be5f69ff3fed1ae798ff8a047206d0753fd8af5e5bb9cb7310b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xintsession-doc"

RDEPENDS:${PN} += ""

inherit rpm
