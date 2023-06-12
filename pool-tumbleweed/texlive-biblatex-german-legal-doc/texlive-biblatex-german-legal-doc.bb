SUMMARY = "Documentation for texlive-biblatex-german-legal"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-german-legal"
LICENSE = "LPPL-1.0"

PV = "2023.201.003svn66461"

RPM_NAME = "texlive-biblatex-german-legal-doc-2023.201.003svn66461-53.1.noarch.rpm"
RPM_HASH = "f76346df7b6ad0d06ff973c5271376455ea66264306f60aca59c1d96fc6be4ebe9cb58a9808019873a730ce5d21a1d09c51f70ae7e2622a459ab4ffa98dad704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-german-legal-doc:de) \
texlive-biblatex-german-legal-doc"
RDEPENDS:${PN} += ""

inherit rpm
