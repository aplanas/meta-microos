SUMMARY = "Documentation for texlive-fontname"
DESCRIPTION = "This package includes the documentation for texlive-fontname"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64477"

RPM_NAME = "texlive-fontname-doc-2023.201.svn64477-52.1.noarch.rpm"
RPM_HASH = "3d0890c666c01e2fc3b1dc4f2b70b43412429faaa18075ad86266b254b918a21c5ed1587d5ef6bcba126118c6218ca54266e1fbafedc9a7ed939ca712fc9ed5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fontname-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
