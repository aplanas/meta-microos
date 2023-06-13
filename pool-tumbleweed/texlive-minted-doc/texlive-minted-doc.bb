SUMMARY = "Documentation for texlive-minted"
DESCRIPTION = "This package includes the documentation for texlive-minted"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn65252"

RPM_NAME = "texlive-minted-doc-2023.201.2.7svn65252-54.1.noarch.rpm"
RPM_HASH = "c25c366fff6d6ee2fed649f39cb9b6f5939f26b592cd35f73a1d96752c5cb9d592a22ca33266950d787de92535e3fc7302a74ce703600c69de23cd4c0111703e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minted-doc"

RDEPENDS:${PN} += ""

inherit rpm
