SUMMARY = "Documentation for texlive-pgf-umlcd"
DESCRIPTION = "This package includes the documentation for texlive-pgf-umlcd"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.3svn63386"

RPM_NAME = "texlive-pgf-umlcd-doc-2023.201.0.0.3svn63386-51.1.noarch.rpm"
RPM_HASH = "fe064b31aa642d42f5f024836587101263eee82d3bc24df860894c4e9308ed5368a6a50e02da9177ab6e68d42d862999476e54c577b4cf9ea894fe6f1ab7bc7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-umlcd-doc"

RDEPENDS:${PN} += ""

inherit rpm
