SUMMARY = "Documentation for texlive-xintsession"
DESCRIPTION = "This package includes the documentation for texlive-xintsession"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4alphasvn60926"

RPM_NAME = "texlive-xintsession-doc-2023.201.0.0.4alphasvn60926-52.2.noarch.rpm"
RPM_HASH = "16887d6c2b9554a85954070314fa01626669d6effabd03a730daf506931284aaba6ac3bb2aefae66d4cf97e5eb226f775b8452e19dd645d406a1175472f33684"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xintsession-doc"

RDEPENDS:${PN} += ""

inherit rpm
