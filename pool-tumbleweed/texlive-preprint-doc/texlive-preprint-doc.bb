SUMMARY = "Documentation for texlive-preprint"
DESCRIPTION = "This package includes the documentation for texlive-preprint"
LICENSE = "LPPL-1.0"

PV = "2023.201.2011svn30447"

RPM_NAME = "texlive-preprint-doc-2023.201.2011svn30447-52.1.noarch.rpm"
RPM_HASH = "1f6a0af08f34c71218168d3e00af444894b6bad0c798b9f0bbc224e92ccbe21108303849a6a5b71655beb4467949649f2ca86b5f2b66e536fdd28153320e8550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-preprint-doc"
RDEPENDS:${PN} += ""

inherit rpm
