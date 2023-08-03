SUMMARY = "Documentation for texlive-hepunits"
DESCRIPTION = "This package includes the documentation for texlive-hepunits"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn54758"

RPM_NAME = "texlive-hepunits-doc-2023.209.2.0.0svn54758-54.1.noarch.rpm"
RPM_HASH = "27c4a886da9c426274dd26cdc48e7dd5f04248af22bf53251698046b0105a469f8351f9f4d994ca2e48ae7b32990936f656fdad708aa960c8fb900f0a77f60bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepunits-doc"

RDEPENDS:${PN} += ""

inherit rpm
