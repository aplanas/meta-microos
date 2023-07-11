SUMMARY = "Documentation for texlive-pxrubrica"
DESCRIPTION = "This package includes the documentation for texlive-pxrubrica"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3esvn66298"

RPM_NAME = "texlive-pxrubrica-doc-2023.201.1.3esvn66298-53.2.noarch.rpm"
RPM_HASH = "1bf432a71157d22115ee5fa5d611895e729c1341db391708001ee1a66c503c8e94a5414299d0a6c9bb6610b94835431ad392f0b797ad4e947c083a8e8cca3828"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxrubrica-doc-ja \
texlive-pxrubrica-doc"

RDEPENDS:${PN} += ""

inherit rpm
