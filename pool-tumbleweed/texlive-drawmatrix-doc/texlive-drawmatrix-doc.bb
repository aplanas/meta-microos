SUMMARY = "Documentation for texlive-drawmatrix"
DESCRIPTION = "This package includes the documentation for texlive-drawmatrix"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.0svn44471"

RPM_NAME = "texlive-drawmatrix-doc-2023.209.1.5.0svn44471-53.1.noarch.rpm"
RPM_HASH = "5edb971a597e5c0c4ff1cb9cb4c39ad10372db544584dc52d894a3aab7abca1284438ba5a3c9c5a27bb79551a7d363f39f8cc9726f94293131e2295632dceeb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawmatrix-doc"

RDEPENDS:${PN} += ""

inherit rpm
