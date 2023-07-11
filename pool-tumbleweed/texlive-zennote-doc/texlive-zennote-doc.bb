SUMMARY = "Documentation for texlive-zennote"
DESCRIPTION = "This package includes the documentation for texlive-zennote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn65549"

RPM_NAME = "texlive-zennote-doc-2023.201.1.0.0svn65549-52.2.noarch.rpm"
RPM_HASH = "f9f27c1bd356823db5cde51ea9f533c384d25af4289a9e818eff5c60bd57d265d4da5383f55b151acb60feb2a7471dbfcb44279841640e59b78b4b61d3d0fb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zennote-doc"

RDEPENDS:${PN} += ""

inherit rpm
