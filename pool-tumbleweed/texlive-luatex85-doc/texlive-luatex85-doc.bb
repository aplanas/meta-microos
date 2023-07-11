SUMMARY = "Documentation for texlive-luatex85"
DESCRIPTION = "This package includes the documentation for texlive-luatex85"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4svn41456"

RPM_NAME = "texlive-luatex85-doc-2023.208.1.4svn41456-53.1.noarch.rpm"
RPM_HASH = "2e4dc1b04d9bdbfed850494808ab4eee591ed45a1582dce85738a7938be2517fb3a26e2a74ac2a45ef9491c6a6c2ec8c1b26dc97aee67a39c851cd25e823cc23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatex85-doc"

RDEPENDS:${PN} += ""

inherit rpm
