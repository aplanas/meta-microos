SUMMARY = "Documentation for texlive-genealogytree"
DESCRIPTION = "This package includes the documentation for texlive-genealogytree"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.0svn66513"

RPM_NAME = "texlive-genealogytree-doc-2023.201.2.3.0svn66513-52.1.noarch.rpm"
RPM_HASH = "dcc4dfa44b75c545fdc53814473c4f30d866c06caecc6b842cbd0d3236165f57791957c0f3ed53c230b6941ac32a86ae147799cf0d20d9f28bc3cc8977921d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-genealogytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
