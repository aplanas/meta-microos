SUMMARY = "Documentation for texlive-psfrag"
DESCRIPTION = "This package includes the documentation for texlive-psfrag"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.04svn15878"

RPM_NAME = "texlive-psfrag-doc-2023.209.3.04svn15878-53.1.noarch.rpm"
RPM_HASH = "4dd1afb21fa3dcc4e2b4e7a84b5bf7cf6914662cfeea60cd7662328fb00a4ea22d31d101a090f81e01ca2b4d5ebdd39eae355d1f59eed346b041c37725a0777f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-psfrag-doc-en \
texlive-psfrag-doc"

RDEPENDS:${PN} += ""

inherit rpm
