SUMMARY = "Documentation for texlive-hyperref"
DESCRIPTION = "This package includes the documentation for texlive-hyperref"
LICENSE = "LPPL-1.0"

PV = "2023.209.7.00vsvn65758"

RPM_NAME = "texlive-hyperref-doc-2023.209.7.00vsvn65758-54.1.noarch.rpm"
RPM_HASH = "c0cac9157fa376d0c13767e2be9b2409e6f334032f7082e06f7e4af757e40ebcfb9c9db756e3ca5a86725b406ce30d4b364d60b298c1cdbc794fce93b2d706d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyperref-doc-en \
texlive-hyperref-doc"

RDEPENDS:${PN} += ""

inherit rpm
