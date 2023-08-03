SUMMARY = "Documentation for texlive-simples-matrices"
DESCRIPTION = "This package includes the documentation for texlive-simples-matrices"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn63802"

RPM_NAME = "texlive-simples-matrices-doc-2023.209.1.0.1svn63802-54.1.noarch.rpm"
RPM_HASH = "3f14e144f45c8cdecedbded96c65972d80068529a68d2e6e42a06d8b0ba46a4aeedf20e27c750ea04e4a37d772e110b8d5364f6b7a83ac5e73edf898eb651b1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-simples-matrices-doc-fr;en \
texlive-simples-matrices-doc"

RDEPENDS:${PN} += ""

inherit rpm
