SUMMARY = "Documentation for texlive-circledtext"
DESCRIPTION = "This package includes the documentation for texlive-circledtext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn63166"

RPM_NAME = "texlive-circledtext-doc-2023.201.1.1.0svn63166-53.1.noarch.rpm"
RPM_HASH = "d5cebd554a29d113adba7b6b41f655c1ceb7bfdd9b94ac6c433cf2b1fdf33d072f9aaca473b06cec5b3c96f9874ecc8038c26b9ae8ef602ec30be8f8d1e3f450"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-circledtext-doc-zh \
texlive-circledtext-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
