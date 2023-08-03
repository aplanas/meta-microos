SUMMARY = "Documentation for texlive-biblatex-source-division"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-source-division"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4.2svn45379"

RPM_NAME = "texlive-biblatex-source-division-doc-2023.209.2.4.2svn45379-54.1.noarch.rpm"
RPM_HASH = "5a507d77a30104050fc544e9b10e619a1fb8e661114d56e6cd40c10d069b63c6e0b0fe4c49da429385141d239ab41799890ef2d3fcd40dc6760e776c0103cf03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-source-division-doc"

RDEPENDS:${PN} += ""

inherit rpm
