SUMMARY = "Documentation for texlive-centeredline"
DESCRIPTION = "This package includes the documentation for texlive-centeredline"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64672"

RPM_NAME = "texlive-centeredline-doc-2023.201.1.2svn64672-52.1.noarch.rpm"
RPM_HASH = "9be824802241fba78dfee86a28dd58820e374cc29fc818bc858114f5f6e3284b199d46d86629c9304783f5bc77bf363e0746cbd8ec50635eb48ebd4d1847f8a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-centeredline-doc"

RDEPENDS:${PN} += ""

inherit rpm
