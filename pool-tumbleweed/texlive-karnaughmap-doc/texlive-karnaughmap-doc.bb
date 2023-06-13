SUMMARY = "Documentation for texlive-karnaughmap"
DESCRIPTION = "This package includes the documentation for texlive-karnaughmap"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn36989"

RPM_NAME = "texlive-karnaughmap-doc-2023.201.2.0svn36989-55.1.noarch.rpm"
RPM_HASH = "ef86d1c42c9fb139583c6a8d0018c882a1d98baa1bd9c5fc29b8e63cee22b54dde0d05d12e95206a7c025095df1bd0f18064b5197f5b834a528f04c4d81d2820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-karnaughmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
