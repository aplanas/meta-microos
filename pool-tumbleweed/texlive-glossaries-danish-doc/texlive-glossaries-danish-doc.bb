SUMMARY = "Documentation for texlive-glossaries-danish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-danish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "7163f73da8e5619e0a4ba462c6b8ffd8b34c00ff7b9e8746eff7d52ead9e329d4bac69b11bf2effdba5f28b63893451b22259a962c5f70dcbf90edfc6f2f6f8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
