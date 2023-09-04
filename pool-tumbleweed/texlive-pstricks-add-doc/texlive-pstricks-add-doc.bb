SUMMARY = "Documentation for texlive-pstricks-add"
DESCRIPTION = "This package includes the documentation for texlive-pstricks-add"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-doc-2023.209.3.93svn65067-54.2.noarch.rpm"
RPM_HASH = "3d11730ee19982ffac3e2a1ab269869fc418d39ec206c990b655f4dd2e6b0124b84137654b5c480bc063f8fc0a47ba3d2124b778069efb3a72e25c8bccba80c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
