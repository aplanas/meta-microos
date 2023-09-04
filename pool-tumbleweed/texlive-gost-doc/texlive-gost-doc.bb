SUMMARY = "Documentation for texlive-gost"
DESCRIPTION = "This package includes the documentation for texlive-gost"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2lsvn57616"

RPM_NAME = "texlive-gost-doc-2023.209.1.2lsvn57616-54.2.noarch.rpm"
RPM_HASH = "68d55f5d3ca8f37a98005d8b0ca4822ed7070051d1fb4e1a322f15e313511b8c8d3282562aa05ea650edf14cd43806d907729a2f9eb2d49cc8ecc0dee0d0d86b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gost-doc-en \
texlive-gost-doc"

RDEPENDS:${PN} += ""

inherit rpm
