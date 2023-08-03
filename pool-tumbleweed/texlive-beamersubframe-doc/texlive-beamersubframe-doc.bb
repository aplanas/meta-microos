SUMMARY = "Documentation for texlive-beamersubframe"
DESCRIPTION = "This package includes the documentation for texlive-beamersubframe"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn23510"

RPM_NAME = "texlive-beamersubframe-doc-2023.209.0.0.2svn23510-54.1.noarch.rpm"
RPM_HASH = "8ad77003dd9e73163dea3e2ba6ba26e5fb645a5eb448ed1c38ae63975b9836e2d0be53978d37c4246f9df6eaaef3e202ef38bc17ef66f4f59e92cbd170e2ecb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamersubframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
