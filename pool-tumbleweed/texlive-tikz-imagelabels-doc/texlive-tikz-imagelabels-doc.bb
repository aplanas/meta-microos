SUMMARY = "Documentation for texlive-tikz-imagelabels"
DESCRIPTION = "This package includes the documentation for texlive-tikz-imagelabels"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn51490"

RPM_NAME = "texlive-tikz-imagelabels-doc-2023.201.0.0.2svn51490-52.1.noarch.rpm"
RPM_HASH = "2b895f8cd2b3fff29012788bde917eaf76d86d2cd5a3fde82487c71838be0a9d9edc2cc02bdf138c634ddca4dc81f551cb746a72923ba07e52f7c04ab2ebb9b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-imagelabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
