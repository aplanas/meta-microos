SUMMARY = "Documentation for texlive-tikzpfeile"
DESCRIPTION = "This package includes the documentation for texlive-tikzpfeile"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25777"

RPM_NAME = "texlive-tikzpfeile-doc-2023.209.1.0svn25777-53.1.noarch.rpm"
RPM_HASH = "8a155fb871ce6016362891a890419c242f443efc92fc9de3b7e7d0959acaebae1179d1fec3199ef96fbed99ee23710c1c160ebaf51260fc0bd4b18d4efd63ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzpfeile-doc"

RDEPENDS:${PN} += ""

inherit rpm
