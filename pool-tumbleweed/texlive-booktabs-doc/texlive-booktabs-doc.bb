SUMMARY = "Documentation for texlive-booktabs"
DESCRIPTION = "This package includes the documentation for texlive-booktabs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.61803398svn53402"

RPM_NAME = "texlive-booktabs-doc-2023.209.1.61803398svn53402-53.1.noarch.rpm"
RPM_HASH = "10dc6ffe48c58ce9561c046071197b2e27610e15c281b4a69a4f9be6372ef7151a7103dd37aff35a5a92e1f57a9f3143cb6c3e933d1b237c1ed9bba718b71fb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-booktabs-doc-en \
texlive-booktabs-doc"

RDEPENDS:${PN} += ""

inherit rpm
