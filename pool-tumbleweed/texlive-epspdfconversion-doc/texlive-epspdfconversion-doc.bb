SUMMARY = "Documentation for texlive-epspdfconversion"
DESCRIPTION = "This package includes the documentation for texlive-epspdfconversion"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.61svn18703"

RPM_NAME = "texlive-epspdfconversion-doc-2023.201.0.0.61svn18703-53.2.noarch.rpm"
RPM_HASH = "e134b474110d71483bd96da03fa8dd364826d8831bbc8d8bbc87ba3a6b4ec8b803fca32a90f54f2ad92ebcb444182d420ddc38fd27ae6b6a39bb5299f683b707"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epspdfconversion-doc"

RDEPENDS:${PN} += ""

inherit rpm
