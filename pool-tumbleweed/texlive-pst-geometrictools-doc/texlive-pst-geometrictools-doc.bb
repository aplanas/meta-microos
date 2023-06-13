SUMMARY = "Documentation for texlive-pst-geometrictools"
DESCRIPTION = "This package includes the documentation for texlive-pst-geometrictools"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61430"

RPM_NAME = "texlive-pst-geometrictools-doc-2023.201.1.3svn61430-52.1.noarch.rpm"
RPM_HASH = "b0240b28f120d89804e250426e7d52c582229489b7c7e958afbe88556027a4f41aabde5c0a0634b8a743fb77e8399d219798f92aa3fe21afb6bcccf7b5c69856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-pst-geometrictools-doc:fr) \
texlive-pst-geometrictools-doc"

RDEPENDS:${PN} += ""

inherit rpm
