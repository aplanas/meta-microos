SUMMARY = "Documentation for texlive-tramlines"
DESCRIPTION = "This package includes the documentation for texlive-tramlines"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65692"

RPM_NAME = "texlive-tramlines-doc-2023.209.1.1.0svn65692-53.1.noarch.rpm"
RPM_HASH = "d8d6750ae593d8531aa1f2e6ebae4c798ed30d8b76b415955c6f3b49ba1c33a11743f31974e782c1d5a6a7052bf664f2e3cde4f88b34c7cb99c9cfa2ab9e6938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tramlines-doc"

RDEPENDS:${PN} += ""

inherit rpm
