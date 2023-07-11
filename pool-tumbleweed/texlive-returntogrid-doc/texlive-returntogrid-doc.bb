SUMMARY = "Documentation for texlive-returntogrid"
DESCRIPTION = "This package includes the documentation for texlive-returntogrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn48485"

RPM_NAME = "texlive-returntogrid-doc-2023.201.0.0.2svn48485-53.2.noarch.rpm"
RPM_HASH = "393db893b14fdc16bd3762227e9077b4bb21721fe837317fbfa9e364b184b22f8cdeed6f14b0241281a49bfe8a2a2fcf40372e15750f1504766c13c8225ff41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-returntogrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
