SUMMARY = "Documentation for texlive-fonetika"
DESCRIPTION = "This package includes the documentation for texlive-fonetika"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21326"

RPM_NAME = "texlive-fonetika-doc-2023.209.svn21326-53.1.noarch.rpm"
RPM_HASH = "954caf5e2c6b7f3fa0254eb7f65b541d4bbb4291cb9c956fe0d6fda88c37385743df48b00576d2e4cd6d3af4fe9750618124da0050848e050f2ddb59b46e6acf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonetika-doc"

RDEPENDS:${PN} += ""

inherit rpm
