SUMMARY = "Documentation for texlive-textfit"
DESCRIPTION = "This package includes the documentation for texlive-textfit"
LICENSE = "LPPL-1.0"

PV = "2023.209.5svn20591"

RPM_NAME = "texlive-textfit-doc-2023.209.5svn20591-55.1.noarch.rpm"
RPM_HASH = "76d4ec49f991c6d37b7a85f501bdf5580a4c224d8ba65b6a184fe5bd47a3fa6c97a1188cb2d8b0a942305057e14bfa0fe2e1067b782a4f2f70a9f6ab25fe4bc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textfit-doc"

RDEPENDS:${PN} += ""

inherit rpm
