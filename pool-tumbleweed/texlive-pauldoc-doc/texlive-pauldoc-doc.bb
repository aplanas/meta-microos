SUMMARY = "Documentation for texlive-pauldoc"
DESCRIPTION = "This package includes the documentation for texlive-pauldoc"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn16005"

RPM_NAME = "texlive-pauldoc-doc-2023.209.0.0.5svn16005-52.1.noarch.rpm"
RPM_HASH = "1e85e1f341fb3f54b1513712482cd416f13d8c421a989dfb909c6effe3e708b2e4d0d19e6a0b5072dafe076d927c5dd97034ef3410bd2690483b0ec1e9745c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pauldoc-doc-de \
texlive-pauldoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
