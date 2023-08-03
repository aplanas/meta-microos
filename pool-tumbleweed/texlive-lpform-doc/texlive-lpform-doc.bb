SUMMARY = "Documentation for texlive-lpform"
DESCRIPTION = "This package includes the documentation for texlive-lpform"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36918"

RPM_NAME = "texlive-lpform-doc-2023.209.svn36918-55.1.noarch.rpm"
RPM_HASH = "04679a2e1d50b9395245b71a98f48846dde6c696f25189ed19237503d65ffb108310356a63473fa85663d32bfd134758043c32ec02e195db8fdea0a4a7604320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lpform-doc"

RDEPENDS:${PN} += ""

inherit rpm
